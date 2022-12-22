package tw.leonchen.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.LoginService;

public class DemoLoginAction {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		LoginService loginService1 = context.getBean("loginService1",LoginService.class);
		boolean result = loginService1.checkLogin("john","test123");
		System.out.println("result: "+result);
		
		LoginService loginService2 = context.getBean("loginService1",LoginService.class);
		boolean result2 = loginService2.checkLogin("john","123");
		System.out.println("result2: "+result2);
		
		context.close();
	
	}

}
