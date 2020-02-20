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

@Controller
public class Hellobean3{
	@RequestMapping("bye1")
	public String bye1(String name,Model model) {
		System.out.println(name);
		model.addAttribute("name", name);
		return "spring0219/bye1";
	}
	
}
