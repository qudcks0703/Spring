package test.spring.bean;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import test.spring.model.TestDTO;
import test.spring.model.TvDTO;

@Controller
public class HelloBean02 {
	//a ������ �ڵ� ����
//	@Autowired
//	private Date day =null;
//	
//	/*
//	 * ���� Ÿ���� �� �ΰ��� ������ �����̸��� �°� ���Ե�. 
//	 * �ڵ������� ���Ե� ��, �⺻������ "Ŭ����Ÿ������ ����" �ؼ� �������µ�
//	 * (bean�� id�Ӽ����� �̰��� �����̸��� �޶� �������)
//	 * ���� ���� Ÿ���� bean ��ü�� �������� �ִٸ� bean�� id�Ӽ����� �������� ������ ���� ������. 	 
//	 * 
//	 * 
//	 */
//	@Autowired
//	
//	private TestDTO dto1 = null;
//	
//	@Autowired
//	private TestDTO dto2 = null;
//	
//	
//	@RequestMapping("hello2.do")
//	public String hello2() {
//		
////		dto.setId("java");
////		dto.setPw("1234");
//		System.out.println("===================dto1===================");
//		System.out.println("id=" + dto1.getId());
//		System.out.println("pw=" + dto1.getPw());
//		System.out.println("reg="+ dto1.getReg());
//		
//		System.out.println("===================dto2===================");
//		System.out.println("id=" + dto2.getId());
//		System.out.println("pw=" + dto2.getPw());
//		System.out.println("reg="+ dto2.getReg());
//		return "hello";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//		@RequestMapping("form.do")
//		public String form() {
//			//a  form.do �� ��û�ϸ� ��������� jsp(view) ��� ����
//			return "/WEB-INF/views/spring01/loginForm.jsp";
//		}
//		@RequestMapping("pro.do")
////		public String pro(TestDTO dto, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
////		public String pro(TestDTO dto, Model model) {
//		public ModelAndView pro(TestDTO dto) {
//			// a �Ű����� �����ؼ� ���� �Ѿ���� ������ �ޱ�.
//		
////		   System.out.println(id);  
////		   System.out.println(pw);
//		 			
//			// DTO�� �ޱ�
//			System.out.println(dto);
//			System.out.println(dto.getId());
//			System.out.println(dto.getPw());
//			
//			// a model�� �ޱ�
////			model.addAttribute("id", dto.getId());
////			model.addAttribute("pw", dto.getPw());
//			
//			// a modelandview�� �ޱ�
//			
//			// a��ü����
//			ModelAndView mv = new ModelAndView();
//			
//			// a����������
//			mv.addObject("id", dto.getId());
//			mv.addObject("pw", dto.getPw());
//			
//			// view��� ����
//			mv.setViewName("/WEB-INF/views/spring01/loginPro.jsp");
//			
//						
////			return "/WEB-INF/views/spring01/loginPro.jsp";
//			return mv;
//		}
//		
//		//http://localhost:8080/spring/hello3.do?test=%221234%22
//		@RequestMapping("hello3.do")
////		public String hello3(String test) { // a �Ű������� ��û�Ķ���͸� �����ϰ�
//		public String hello3(@RequestParam("test") String tost) { // a �Ű������� ��û�Ķ���͸� �����ϰ�
//			System.out.println(tost);
//			return "/WEB-INF/views/hello.jsp";
//		}
//		
//		//a �Ϲ� �޼��忡 @ModelAttribute ������̼� �߰� --> ��� view���� ���������� �ʿ��� ��ü�� ������
//		// ��������� �𵨿� �Ӽ��� �߰� -> ��Ī�� ����ȿ�� ����.
//		@ModelAttribute("tvInfo")
//		public TvDTO getTv(String col) {
//			System.out.println("getTvȣ��");
//			TvDTO tv = new TvDTO();
//			tv.setPower(true);
//			tv.setCh(10);
//			tv.setCol(col);
//			
//			return tv; // �Ϲ������� �𵨿� �Ӽ��߰�.
//		}
//		
//		//a ���� �޼���
//		@RequestMapping("hello4.do")
//		public String hello4(Model model) {
//						
//			System.out.println("hello4 ���� �޼��� ȣ��!!");
//			return "/WEB-INF/views/spring01/helloTv.jsp";
//		}
//		
//		//a �޼��忡 @ModelAttribute ����
//		@RequestMapping("form2.do")
//		public String sendMsg() {
//			return "/WEB-INF/views/spring01/loginForm.jsp";
//		}
//		@RequestMapping("pro2.do")
//		public String viewMsg(@ModelAttribute("dto") TestDTO dto) {
//			// �Ű����� TestDTO dto��� �����ϸ� set�޼���� �ڵ� ���ε���.
//			// ������̼� ȿ���� dto��� ��Ī����  Model�� ���� -> view���� ������ �� ����.
//			System.out.println(dto.getId());
//			System.out.println(dto.getPw());
//			return "/WEB-INF/views/spring01/loginPro.jsp";
//		}
//		@RequestMapping("hello5.do")
//		@ResponseBody
//		public String hello05() {	// 
//			return "Helloooo5!!!";
//		}
//		
//		// RequestMapping �ɼǵ�
//		// value = �ּ�, method = ���۹��, param = �Ķ����
////		@RequestMapping(value="hello6.do", params="id=java") id�Ķ���ʹ� java���̿��� �Ѵٴ� ���� ����
//		@RequestMapping(value="hello6.do", params= {"id=java","pw", "!age"})
//		public String hello6(String id, String pw) {
//			System.out.println(id);
//			System.out.println(pw);
//			
//			return "/WEB-INF/views/hello.jsp";
//		}
//		
//		
//		// value : �Ķ���͸�   required : �Ķ���� �ʼ�����   defaultValue : �⺻��
//		@RequestMapping("hello8.do")
//		// �Ķ���� ������ �־�� ���εǴ� ���	(required=true�� �⺻����)
////		public String hello8(@RequestParam("id") String msg) {
//		// �Ķ���� �����ص� ���εǴ� ���.
////		public String hello8(@RequestParam(value="msg",defaultValue="hello") String msg) {	// defaultValue���� �־ �Ķ���Ͱ� �ȵ��͵� �⺻���� �۵��Ѵ�.
////		public String hello8(@RequestParam(value="msg",required=false) String msg) {	// defaultValue���� �־ �Ķ���Ͱ� �ȵ��͵� �⺻���� �۵��Ѵ�.
//		public String hello8(
//				@RequestParam(value="id",required=true) String id, 
//				@RequestParam(value="pw",required=true) String pw,
//				@RequestParam(value="auto",required=false, defaultValue="0") String auto){	// defaultValue���� �־ �Ķ���Ͱ� �ȵ��͵� �⺻���� �۵��Ѵ�.
//			
//			System.out.println(id);
//			System.out.println(pw);
//			System.out.println(auto);
//			
//			return "/WEB-INF/views/hello.jsp";
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
		
		
		
		
		
}