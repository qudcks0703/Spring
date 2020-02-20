package test.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadBean {
	@Autowired
	private ModelAndView mv=null;
	@RequestMapping("/uploadForm")
	public ModelAndView uploadForm() {
		mv.setViewName("spring0220/form");
		System.out.println("test");
		return mv;
	}
	@RequestMapping("/uploadPro")
	public ModelAndView uploadPro1(MultipartHttpServletRequest request) {
		//System.out.println(writer);
		System.out.println(request.getFile("img"));
		System.out.println(request.getParameter("writer"));
		mv.setViewName("spring0220/formpro");
		return mv;
	}
	
}
