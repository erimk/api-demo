package com.example.apidemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.apidemo.model.service.ApiService;

@SpringBootTest
class ApiDemoApplicationTests {

    @Autowired
    MockMvc mvc;

    @MockBean
    ApiService service;

	@Test
	void contextLoads() {
	}
	
	@Test
	void getLoginTest() {
	}

}
