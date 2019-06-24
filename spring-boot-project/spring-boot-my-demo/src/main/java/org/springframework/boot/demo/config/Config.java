package org.springframework.boot.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：
 *
 * @Author shf
 * @Date 2019/6/8 19:46
 * @Version V1.0
 **/
@Configuration
@EnableConfigurationProperties(ConfigProperties.class)
public class Config {
	@Autowired
	private ConfigProperties configProperties;

	@Bean(name = "test")
	public String string(){
		System.out.println(configProperties.getHello());
		return configProperties.getHello();
	}
}
