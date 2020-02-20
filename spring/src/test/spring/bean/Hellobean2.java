package test.spring.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import test.spring.model.TestDTO;
import test.spring.model.TvDTO;

//@Controller
public class Hellobean2{

	//@RequestMapping("signup")
	public String signup() {
		return "/WEB-INF/views/spring0219/signup.jsp";
	}
	//모델이 있으면 view에 데이터 전달가능
	//단 requestmapping이 설정된 메서드만 사용가능
	@RequestMapping("pro")
	public String pro1(TestDTO dto,Model model,ModelAndView modelview) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		model.addAttribute("id", dto.getId());
		modelview.addObject("pw", dto.getPw());
		modelview.setViewName("/WEB-INF/views/spring0219/pro.jsp");
		return "/WEB-INF/views/spring0219/pro.jsp";
	}
	@RequestMapping("pro")
	public ModelAndView pro(TestDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		ModelAndView mv=new ModelAndView();
		mv.addObject("id", dto.getId());
		mv.addObject("pw", dto.getPw());
		mv.setViewName("/WEB-INF/views/spring0219/pro.jsp");
		return mv;
	}
	
	@Autowired
	@Qualifier("day1")
	private Date day=null;
	@Autowired
	@Qualifier("dto1")
	private TestDTO dto=null;
	@RequestMapping("hello2")
	//dto bean설정방법
	public String hello2() {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getReg());
		return "/WEB-INF/views/spring0218/hello.jsp";
	}
	//requestparam 내가원하는 값으로 받을수잇는방법
	@RequestMapping("hello3")
	public String hello3(@RequestParam("test") String test) {
		System.out.println(test);
		return "/WEB-INF/views/spring0218/hello.jsp";
	}
	
	//model메서드없이 보내는방법
	
	@RequestMapping("hellotv")
	public String hellotv() {
		
		System.out.println("hello4 매핑 메서드 호출");
		return "/WEB-INF/views/spring0219/hellotv.jsp";
	}
	
	@Autowired
	@Qualifier("tdto1")
	private TvDTO tdto1=null;
	
	@Autowired
	@Qualifier("tdto2")
	private TvDTO tdto2=null;
	//모든 뷰페이지에에 필요한 객체 생성할때 사용
	@ModelAttribute("DTO1")
	public TvDTO getTv1(String col) {
		System.out.println("getTv 호출");
		tdto1.setCol(col);
		return tdto1;
	}
	//modelattribute를 사용하여서 setattribute사용없이 바로사용가능
	@ModelAttribute("DTO2")
	public TvDTO getTv2(String col) {
		System.out.println("getTv 호출");
		tdto2.setCol(col);
		return tdto2;
	}
	
	
	@RequestMapping("hello4")
	@ResponseBody//리턴하는 문자열을뿌려줌
	public String hello4() {
		
		return "<h1>zzzzzzzzzzzz</h1>";
	}
	@RequestMapping(value = "hello5",params = {"id","pw"}) //id가 있어야만 들어올수잇음
	public String hello5() {
		
		return "/WEB-INF/views/spring0219/hellotv.jsp";
	}
	
	@RequestMapping("hello6") //id가 있어야만 들어올수잇음
	public String hello6(@RequestParam(value="msg",defaultValue = "zz") String msg,
			@RequestParam(value="msa",required = false)String msa) {
		
		return "/WEB-INF/views/spring0219/hellotv.jsp";
	}
	
}
