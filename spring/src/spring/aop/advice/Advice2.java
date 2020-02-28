package spring.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice2 {
	 
		@Pointcut("execution(* spring..*(..))")
		public void testPc() {
			System.out.println("하이룽");
		}
		
		@Around("testPc()")
		public Object zz(ProceedingJoinPoint j) throws Throwable {
			return j.proceed();
		}
		@Before("execution(* spring.aop..*(..))")
	    public void before(JoinPoint joinPoint) {
		 	System.out.println(joinPoint.getSignature().toShortString());
	        String signatureString = joinPoint.getSignature().getName();
	        System.out.println("@Before [" + signatureString + "] 메서드 실행 전처리 수행");
	        for(Object arg:joinPoint.getArgs()) {
	            System.out.println("@Before [" + signatureString + "] 아규먼트" + arg);
	        }
	    }
	    @AfterReturning(pointcut="execution(* spring.aop..*(..))",returning="ret")
	    public void afterReturning(JoinPoint joinPoint, Object ret) {
	        String signatureString = joinPoint.getSignature().getName();
	        System.out.println("@AfterReturning [" + signatureString + "] 메서드 실행 후처리 수행");
	        System.out.println("@AfterReturning [" + signatureString + "] 리턴값 = "+ret);
	    }
	    
	    @AfterThrowing(pointcut="execution(* spring.aop..*(..))",throwing="ex")
	    public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
	        String signatureString = joinPoint.getSignature().getName();
	        System.out.println("@AfterThrowing [" + signatureString + "] 메서드 실행 중 예외 발생");
	        System.out.println("@AfterThrowing [" + signatureString + "] 예외 = "+ex);
	    }
	    
	    @After("execution(* spring.aop..*(..))")
	    public void afterFinally(JoinPoint joinPoint) {
	        String signatureString = joinPoint.getSignature().getName();
	        System.out.println("@After [" + signatureString + "] 메서드 실행 완료");
	    }
    
}