package com.example.demo;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Description("Test di prova")
	@Test
	void contextLoads() {
		Assertions.assertTrue(true);
	}

}
