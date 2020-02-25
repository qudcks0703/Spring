package member.controller.bean;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import member.model.dao.MemDAOimpl;
import member.model.dao.MemberVO;

@Controller
@RequestMapping("/member/")
public class MemberBean {
	
	@Autowired
	private MemDAOimpl mDAO=null;
	@Autowired
	private ModelAndView mv =null;
	
	@RequestMapping("**")
	public String all() {
		return null; 
	}
	
	@RequestMapping("signuppro.do")
	public String signup(MemberVO vo) throws Exception {
		mDAO.insertMember(vo);
		return "member/main";
	}
	@RequestMapping("logout.do")
	public String logout(HttpSession session) throws Exception {
		session.invalidate();
		return "member/main";
	}
	@RequestMapping("loginpro.do")
	public ModelAndView login(MemberVO vo,String auto,HttpSession session) throws Exception {
		int check=mDAO.loginMember(vo);
		if(check==1) {
			session.setAttribute("memId", vo.getId());
		}
		mv.addObject("check", check);
		mv.setViewName("member/loginpro");
		return mv;
	}
	@RequestMapping("modify.do")
	public ModelAndView modify(HttpSession session) throws Exception {
		
		String id=(String)session.getAttribute("memId");
		
		mv.addObject("mdto", mDAO.modifyMember(id));
		mv.setViewName("member/modify");
		return mv;
	}
	@RequestMapping("modifypro.do")
	public void modifypro(MemberVO vo,HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		mDAO.modifyProMember(vo);
		
	      out.println("<script>");
	      out.println("alert('수정축하한다링');");
	      out.println("window.location.href='/spring/member/main.do';");
	      out.println("</script>");
//		mv.setViewName("member/main");
//		return mv;
	}
	
	
}
