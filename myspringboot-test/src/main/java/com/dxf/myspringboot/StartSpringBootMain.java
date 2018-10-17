package com.dxf.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class StartSpringBootMain {
	@RequestMapping("/")
	String home() {
		return "独善其身的狗!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StartSpringBootMain.class, args);
	}

}
