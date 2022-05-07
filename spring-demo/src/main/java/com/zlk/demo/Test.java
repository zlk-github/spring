package com.zlk.demo;


import com.zlk.demo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		//方式1拿到配置文件获取上下文
		// 不是根目录，用FileSystemXmlApplicationContext
		/*String xmlPath = "/resources/applicationContext.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
	    // 如果是放在根目录下
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	    */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		WelcomeService welcomeService = (WelcomeService)applicationContext.getBean("welcomeService");
		welcomeService.getName("cs1001");

		//方式2 实现ApplicationContextAware接口(未测试)
		//方式3 Spring中获取ServletContext对象，普通类中可以这样获取(未测试)
		//ServletContext sc = ContextLoader.getCurrentWebApplicationContext().getServletContext();
		//ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
	//	WelcomeService bean = applicationContext.getBean(WelcomeService.class);

		System.out.printf("test");
	}
}
