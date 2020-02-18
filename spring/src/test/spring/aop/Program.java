package test.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {	
		
		ApplicationContext context=
					new ClassPathXmlApplicationContext("test/spring/aop/setting.xml");
		
		Exam proxy=(Exam)context.getBean("exam");
		
		
//		Exam exam=new BcExam(1, 1, 1);
//		Exam proxy=(Exam)Proxy.newProxyInstance(BcExam.class.getClassLoader(), new Class[] {Exam.class}, 
//				new InvocationHandler() {
//					
//					@Override //args 메서드 파라미터를 전달함. method는 invoke만
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						long start=System.currentTimeMillis();
//						
//						//젤 중요한거
//						Object result=method.invoke(exam, args);
//						
//						long end=System.currentTimeMillis();
//						String message=(end - start)+"ms 시간이 걸렸습니다.";
//						System.out.println(message);
//						return result;
//					}
//				}
//		);
		//프락시 사용
		System.out.printf("total is %d\n",proxy.total());
		System.out.printf("total is %f\n",proxy.avg());
		//일반 exam
		
	}

}
