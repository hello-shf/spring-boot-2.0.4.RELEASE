package org.springframework.boot.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 描述：
 *
 * @Author shf
 * @Date 2019/6/8 19:45
 * @Version V1.0
 **/
@ConfigurationProperties(prefix = "demo.hello")
public class ConfigProperties {
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
}
