package board.controller.bean;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import board.model.dao.BoardDAOimpl;
import board.model.dao.BoardVO;

@Controller
@RequestMapping("/board/")
public class BoardBean {
	@Autowired
	private ModelAndView mv =null;
	@Autowired
	private BoardDAOimpl bDAO=null;
	
	@RequestMapping("**")
	public String all() {
		return null; 
	}
	
	@RequestMapping("board.do")
	public ModelAndView board(@RequestParam(defaultValue ="1")String pageNum) throws Exception{
		int pageSize=10;
		System.out.println(pageNum+"페이지 접속합니다.");
		int currentPage=Integer.parseInt(pageNum);
		int startRow=(currentPage-1)*pageSize+1;
		int endRow=currentPage * pageSize;
		int count=bDAO.getArticleCount();
		//11,20 
		//1,0
		int number=(count%10==0) ? (count/10):(count/10)+1;
		List bdto=null;
		if(count>0) {
			bdto=bDAO.getArticles(startRow, endRow);
		}else {
			bdto=Collections.EMPTY_LIST;
		}
		mv.addObject("bdto", bdto);
		mv.addObject("number", number);
		mv.setViewName("board/board");
		// WEB-INF/views/board/board.jsp
		return mv;
	}
	@RequestMapping("board_writepro.do")
	public void board_writepro(BoardVO vo,HttpServletResponse response) throws Exception{
		
		BoardVO bdto=bDAO.insertArticle(vo);
		//꿀이다
		
		response.sendRedirect("/spring/board/content.do?num="+bdto.getNum());
	}
	@RequestMapping("content.do")
	public ModelAndView content(int num) throws Exception{
		
		
		BoardVO bdto= bDAO.getArticle(num);
		//꿀이다
		int size=bDAO.getsize();
		mv.addObject("bdto", bdto);
		mv.addObject("size", size);
		mv.setViewName("board/content");
		return mv;
	}
	@RequestMapping("board_update.do")
	public ModelAndView update(int num) throws Exception{
		
		
		BoardVO bdto= bDAO.getArticle(num);
		//꿀이다
		mv.addObject("bdto", bdto);
		mv.setViewName("board/board_update");
		return mv;
	}
	@RequestMapping("board_updatepro.do")
	public ModelAndView updatepro(BoardVO vo,int num,HttpServletResponse response) throws Exception{
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		BoardVO bdto= bDAO.getArticle(num);
		int result=0;
		if(bdto.getPw().equals(vo.getPw())) {
			result=updatepro2(vo);
			response.sendRedirect("/spring/board/content.do?num="+num);
			return mv;
		}else {
			out.println("<script>");
			out.println("alert('비번 틀렸다 꺼져라..');");
			out.println("history.go(-1);");
			out.println("</script>");
			return null;
		}
		//꿀이다
	}
	public int updatepro2(BoardVO vo) throws Exception {
		return bDAO.updateArticle(vo);
	}
	
	
	
//	@RequestMapping("list.do")
//	public ModelAndView list(String pageNum) throws Exception {
//		if(pageNum==null) {
//			pageNum="1";
//		}
//		int pageSize=10;
//		int currentPage=Integer.parseInt(pageNum);
//		int startRow=(currentPage-1)*pageSize+1;
//		int endRow=currentPage * pageSize;
//		int count=0;
//		int number=0;
//		
//		List articleList=null;
//		count=bDAO.getArticleCount();
//		if(count>0) {
//			articleList=bDAO.getArticles(startRow, endRow);
//		}else {
//			//반복 됬을대 널이 안뜸 에러가 잘안발생함.
//			articleList=Collections.EMPTY_LIST;
//		}
//		number=count-(currentPage-1)*pageSize;
//		mv.addObject("articleList", articleList);
//		mv.addObject("startRow", startRow);
//		mv.addObject("endRow", endRow);
//		mv.addObject("currentPage", currentPage);
//		mv.addObject("pageSize", pageSize);
//		mv.addObject("count", count);
//		mv.addObject("number", number);
//		mv.setViewName("board/list");
//		
//		return mv;
//	}
	
	
}
