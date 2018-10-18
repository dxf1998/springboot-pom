package com.dxf.myspringboot;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = StartSpringBootMain.class) // 这里的Application是springboot的启动类名
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@AutoConfigureMockMvc
public class TestStartSpringBootMain_MockMvc {
	private MockMvc mvc;
	@Resource
	public WebApplicationContext context;
	private StartSpringBootMain bootMain;

	@Before
	public void setupMockMvc() throws Exception {
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void TestHome() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("www.wukonglai.com"));
	}
	

}
