package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	MyComponent myComponent;

	@Test
	void contextLoads() {
		System.out.println(myComponent.getFooService());
		System.out.println(myComponent.getPersonService());
	}

}
