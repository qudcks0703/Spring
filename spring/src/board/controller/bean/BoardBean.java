package board.controller.bean;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ModelAndView board(String pageNum) throws Exception{
		if(pageNum==null) {
			pageNum="1";
		}
		int pageSize=10;
		int currentPage=Integer.parseInt(pageNum);
		int startRow=(currentPage-1)*pageSize+1;
		int endRow=currentPage * pageSize;
		int count=bDAO.getArticleCount();
		int number=0;
		List bdto=null;
		if(count>0) {
			bdto=bDAO.getArticles(startRow, endRow);
		}else {
			bdto=Collections.EMPTY_LIST;
		}
		mv.addObject("bdto", bdto);
		mv.setViewName("board/board");
		// WEB-INF/views/board/board.jsp
		return mv;
	}
	@RequestMapping("board_writepro.do")
	public void board_writepro(BoardVO vo,HttpServletResponse response) throws Exception{
		
		bDAO.insertArticle(vo);
		board(null);
		//꿀이다
		response.sendRedirect("/spring/board/board.do");
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
