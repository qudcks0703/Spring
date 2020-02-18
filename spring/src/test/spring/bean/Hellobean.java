package test.spring.bean;

import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//컨트롤러 어노테이션:컨트롤러에서 이클래스를 호출할수있는 빈이라고 알려줌
@Controller
//별 무조건 적어야함 안적으려면 안에도 꼭적어줘야함
//?.do 하면 한글자만 가능.
@RequestMapping("/0218/*")
public class Hellobean{

	@RequestMapping("testaa")
	public String hello() {
		return "/WEB-INF/views/spring0218/hello.jsp";
	}
	@RequestMapping
	public String test() {
		return "/WEB-INF/views/spring0218/test.jsp";
	}
}
