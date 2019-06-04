package org.springframework.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @Author shf
 * @Date 2019/5/20 21:34
 * @Version V1.0
 **/
@RestController
public class WebController {

	@RequestMapping("/web")
	public String web(){
		return "hello shf";
	}
}
