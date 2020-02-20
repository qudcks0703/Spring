package test.spring.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

public class DownloadView extends AbstractView {
	
	public DownloadView() {
		setContentType("application/download; charset=utf-8"); 
	}
	@Override							
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {		
		// modelandview를 통해 보내온 인자를 매브올 받음
		
		//파일 보낼때 파일의 정보를 다같이보냄 
		File file = (File)model.get("downloadFile");		
		response.setContentType(getContentType()); 			
		response.setContentLength((int)file.length());
		
		//파일 인코딩
		String header = request.getHeader("User-Agent");
		boolean b = header.indexOf("MSIE") > -1;
        String fileName = null;
        if (b) {
            fileName = URLEncoder.encode(file.getName(),"UTF-8");
        } else {
            fileName = new String(file.getName().getBytes("UTF-8"),"iso-8859-1");
        }
		response.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\";");  
		response.setHeader("Content-Transfer-Encoding", "binary");
		
		OutputStream out = response.getOutputStream();		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);//다운로드 할 파일 읽기		
			FileCopyUtils.copy(fis, out);	//밖으로 복사
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fis != null) { 
				try {
					fis.close();
				}catch(Exception e2){ 
					e2.printStackTrace(); }
			}
			out.flush();
		}
	
	}
	
}
