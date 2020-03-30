package test.mybatis.bean;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.spring.model.TestDTO;
import test.spring.model.TestMybatisDTO;

@Controller
public class TestMybatis {

	@Autowired
	private SqlSessionTemplate sqlSession=null;
	@Autowired
	private ModelAndView mv=null;
	@RequestMapping("mybatis")
	public String helloMybatis() {
		System.out.println(sqlSession);
		return "spring0218/hello";
	}
	
   @RequestMapping("/test.do")
   public String test() {
       return "test";
   }    
   
   /**
    * Tiles를 사용(header, left, footer 포함)
    */        
   @RequestMapping("/testPage.do")
   public String testPage() {
       return "test.page";
   }
   
   /**
    * Tiles를 사용(header, left, footer 제외)
    */    
   @RequestMapping("/testPart.do")
   public String testPart() {
       return "test.part";
   }    
}
