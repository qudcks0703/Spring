package ban.controller.bean;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/banThing/")
public class BanBean {
	@RequestMapping("*.1")
	public String all1(HttpServletRequest request) {
		String uri=request.getRequestURI();
		
		return uri.split("/")[3];
	}

	/* 타일즈 적용 */
	@RequestMapping("*.2")
	public String all2(HttpServletRequest request) {
		String uri=request.getRequestURI();
		
		return uri.split("/")[3];
	}

	/*
	 * 타일즈 미적용
	 * 
	 * @RequestMapping(value = "indexzz.do") public String test1() {
	 * 
	 * return "banThing/indexzz.jsp"; }
	 */
}
