package org.springframework.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.demo.common.MyApplicationContextInitializer;

@SpringBootApplication
public class SpringBootMyDemoApplication {


	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootMyDemoApplication.class);
		springApplication.addInitializers(new MyApplicationContextInitializer());
		springApplication.run(args);
	}

}
