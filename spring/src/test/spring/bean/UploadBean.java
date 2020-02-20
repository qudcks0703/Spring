package test.spring.bean;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadBean {
	@Autowired
	private ModelAndView mv=null;
	@RequestMapping("/uploadForm")
	public ModelAndView uploadForm() {
		mv.setViewName("spring0220/form");
		return mv;
	}
	//@RequestMapping("/uploadPro")
	public ModelAndView uploadPro1(MultipartHttpServletRequest request) {
		//System.out.println(writer);
		String path="D:\\Byoungchan\\git\\spring\\spring\\WebContent\\save\\";
		//String path=request.getRealPath("save");
		//D:\Byoungchan\spring\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\spring\save
		MultipartFile mf=null;
		try {
			//파일정보 담기
			mf=request.getFile("img");
			//파일 객체 생성 (copyfile안에는  path가 들어있음)
			File copyFile=new File(path+mf.getOriginalFilename());
			//파일 담기 
			mf.transferTo(copyFile);
			//copyFile.delete(); 삭제할때사용
			//System.out.println(copyFile);
		}catch(Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("spring0220/formpro");
		return mv;
		
	}
	@RequestMapping("/uploadPro")
	public ModelAndView uploadPro2(MultipartHttpServletRequest request) {
		//System.out.println(writer);
		MultipartFile mf=null;
		String newName=null;
		try {
			//파일정보 담기
			mf=request.getFile("img");
			//파일 객체 생성 (copyfile안에는  path가 들어있음)
			String orgName=mf.getOriginalFilename();
			
			String imgName=orgName.substring(0,orgName.lastIndexOf('.'));//파일 이름만 추출
			String ext=orgName.substring(orgName.lastIndexOf('.'));
			long s=System.currentTimeMillis();
			//Date date=new Date(s); 이건안됨.. 유감~
			newName=imgName+s+ext;
			String path=request.getRealPath("save");
			System.out.println(path);
			String imgPath=path+"\\"+newName;
			File copyFile =new File(imgPath);
			mf.transferTo(copyFile);
		}catch(Exception e) {
			e.printStackTrace();
		}
		mv.addObject("file", newName);
		mv.setViewName("spring0220/formpro");
		return mv;
	}
	
}
