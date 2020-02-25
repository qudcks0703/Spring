package board.model.dao;

import java.sql.Timestamp;

public class BoardVO {

	  private String writer;
	    private String subject;
	    private String content;
	    private String pw;
	    private Timestamp reg;
	    private int readcount;
	    private int num;
	    private int r;
	    
		public int getR() {
			return r;
		}
		public void setR(int r) {
			this.r = r;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getPw() {
			return pw;
		}
		public void setPw(String pw) {
			this.pw = pw;
		}
		public Timestamp getReg() {
			return reg;
		}
		public void setReg(Timestamp reg) {
			this.reg = reg;
		}
		public int getReadcount() {
			return readcount;
		}
		public void setReadcount(int readcount) {
			this.readcount = readcount;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}

	    
	    

}
