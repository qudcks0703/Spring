package test.spring.bean;

import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//컨트롤러 어노테이션:컨트롤러에서 이클래스를 호출할수있는 빈이라고 알려줌
@Controller
public class Hellobean{

	@RequestMapping("hello.do")
	public String hello() {
		return "/WEB-INF/views/spring0218/hello.jsp";
	}
}
