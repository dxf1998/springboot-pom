package com.dxf.myspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestStartSpringBootMain_Rest {
	private final static String url = "http://localhost:8080/";
	private static RestTemplate resttempate = new RestTemplate();

	@Test
	public void test() {
		ResponseEntity<String> responseEntity = resttempate.exchange(url
				,HttpMethod.GET
				, new HttpEntity(null)
				,String.class);
		System.out.println("result:"+responseEntity.getBody());
	}
}
