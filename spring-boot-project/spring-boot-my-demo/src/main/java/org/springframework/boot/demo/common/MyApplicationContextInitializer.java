package org.springframework.boot.demo.common;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 描述：
 *
 * @Author shf
 * @Date 2019/6/4 9:49
 * @Version V1.0
 **/
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("MyApplicationContextInitializer initialize");
	}
}
