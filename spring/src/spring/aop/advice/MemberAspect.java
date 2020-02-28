package spring.aop.advice;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MemberAspect {
	
	@Around("execution(* test*(..))")
	public Object around(ProceedingJoinPoint j) throws Exception{
		System.out.println("around!");

		//매개변수
		Object[] obj=j.getArgs();
		for(Object o:obj) {
			if(o instanceof HttpServletRequest) {
				HttpServletRequest request=(HttpServletRequest)o;
				HttpSession session=request.getSession();
				String memId=(String)session.getAttribute("memId");
				if(memId==null) {
					System.out.println("로그인 하세요.");
					return "member/loginForm";
							//핵심메서드 리턴타입과 동일하게 처리해야함.
				}
			}
		}
		
		return null;
	}
}
