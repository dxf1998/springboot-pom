package com.dxf.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class StartSpringBootMain {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "www.wukonglai.com";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(StartSpringBootMain.class, args);
	}
}
