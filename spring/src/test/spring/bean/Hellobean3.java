package test.spring.bean;

import java.io.File;
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
	@Autowired
	ModelAndView mv=null;
	@Autowired
	DownloadView dlv=null;
	
	@RequestMapping("bye1")
	public ModelAndView bye1() {
		String path="D:\\Byoungchan\\git\\spring\\spring\\WebContent\\save\\dddd.PNG";
		File f=new File(path);
		//fileDown=xml에 만든 다운로드 id
		//downloadFile=파라미터 명
		//f=다운 시킬 데이터
		mv=new ModelAndView("fileDown", "downloadFile", f);
		return mv;
	}
	@RequestMapping("bye2")
	public ModelAndView bye2() {
		mv.setViewName("hello1");
		return mv;
	}
	
}
