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
	@RequestMapping("testtable")
	public ModelAndView test() {
		int count=(Integer)sqlSession.selectOne("test.usercount");
		int max=(Integer)sqlSession.selectOne("test.maxAge");
		List dto=sqlSession.selectList("test.selectAll");
		mv.addObject("count", count);
		mv.addObject("max", max);
		mv.addObject("dto", dto);
		String id="qudcks";
		TestDTO getid=(TestDTO)sqlSession.selectOne("test.getUser",id);
		mv.addObject("getid", getid);
		mv.setViewName("spring0221/test");
		return mv;
	}
	
	@RequestMapping("signup")
	public ModelAndView signup() {
		
		mv.setViewName("spring0221/signup");
		return mv;
	}
	@RequestMapping("update")
	public ModelAndView update() {
		
		TestDTO dto=(TestDTO)sqlSession.selectOne("test.getUser","qudcks");
		mv.addObject("dto", dto);
		mv.setViewName("spring0221/update");
		return mv;
	}
	@RequestMapping("delete")
	public ModelAndView delete() {
		
		mv.setViewName("spring0221/delete");
		return mv;
	}
	@RequestMapping("signuppro")
	public ModelAndView signuppro(TestDTO dto) {
		//sqlSession.selectOne("signup");
		sqlSession.insert("signup",dto);
		mv.addObject("dto", dto);
		mv.setViewName("spring0221/signuppro");
		return mv;
	}
	@RequestMapping("updatepro")
	public ModelAndView updatepro(String pw,int age,String name) {
		//sqlSession.selectOne("signup");
		HashMap map=new HashMap();
		map.put("mapId", "qudcks");
		map.put("mapPw", pw);
		map.put("mapName", name);
		map.put("mapAge", age);
		sqlSession.update("update",map);
		mv.setViewName("spring0221/updatepro");
		return mv;
	}
	@RequestMapping("deletepro")
	public ModelAndView deletepro(String id) {
		sqlSession.delete("delete", id);
		mv.setViewName("spring0221/deletepro");
		return mv;
	}
}
