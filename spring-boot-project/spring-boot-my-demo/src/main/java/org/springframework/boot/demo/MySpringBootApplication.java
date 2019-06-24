package org.springframework.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.demo.common.ApplicationContextUtil;
import org.springframework.boot.demo.common.MyApplicationContextInitializer;
import org.springframework.boot.demo.service.WebService;
import org.springframework.context.ApplicationContext;

@SpringBootApplication/*(exclude = {DemoConfig.class})*/
//@EnableCaching
public class MySpringBootApplication {
	public static void main(String[] args) {
//		SpringApplication.run(MySpringBootApplication.class, args);
		SpringApplication application = new SpringApplication(MySpringBootApplication.class);
		application.addInitializers(new MyApplicationContextInitializer());
		application.run(args);
		ApplicationContext context = ApplicationContextUtil.getApplicationContext();
		WebService webService = (WebService) context.getBean("webService");
		System.out.println(webService.hello());
	}
}
