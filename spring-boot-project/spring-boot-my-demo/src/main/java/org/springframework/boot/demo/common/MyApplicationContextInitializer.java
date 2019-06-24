package org.springframework.boot.demo.common;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * 描述：
 *
 * @Author shf
 * @Date 2019/6/4 9:49
 * @Version V1.0
 **/
@Order(Ordered.HIGHEST_PRECEDENCE)
public class MyApplicationContextInitializer implements ApplicationContextInitializer{
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		applicationContext.getEnvironment().getPropertySources();
		System.out.println("-----MyApplicationContextInitializer initialize-----");
	}
}
