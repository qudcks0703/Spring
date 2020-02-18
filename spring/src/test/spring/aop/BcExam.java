package test.spring.aop;

public class BcExam implements Exam {

	private int kor;
	private int eng;
	private int com;
	
	
	public BcExam() {
		
	}
	
	public BcExam(int kor, int eng, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}

	@Override
	public String toString() {
		return "BcExam [kor=" + kor + ", eng=" + eng + ", com=" + com + "]";
	}

	@Override
	public int total() {
//		long start=System.currentTimeMillis();
		
		int result=kor+eng+com;
		if(kor>100) {
			throw new IllegalArgumentException("유효하지 않는 국어 점수");
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		long end=System.currentTimeMillis();
//		String message=(end - start)+"ms 시간이 걸렸습니다.";
//		System.out.println(message);
		
		return result;
	} 

	@Override
	public float avg() {
		float result=total()/3.0f;
		return result;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	
}
