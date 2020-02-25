package member.controller.bean;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
			System.out.println(vo.getId());
			System.out.println("실행");
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
	
	@RequestMapping("ajaxIdAvail.do")
	@ResponseBody//html 에 말로 전달하고싶을떄 전송. 만약 태그가필요하면 <h1>이런식으로보내면됨</h1>
	public ResponseEntity<String> ajaxIdAvail(String id,HttpServletResponse response) throws Exception {
		System.out.println("ajax");
		String result="";
		int check=mDAO.idAvailCheck(id);
		if(check==1) {
			result="이미 사용중인 id";
		}else {
			result="사용 가능한 아이디";
		}
		HttpHeaders hh=new HttpHeaders();
		//헤더 정보 입력
		hh.add("Content-type", "text/html;charset=utf-8");
		//httpStatus.OK=200번 create=201번;
		return new ResponseEntity<String>(result, hh, HttpStatus.OK);
	}
	
	
}
