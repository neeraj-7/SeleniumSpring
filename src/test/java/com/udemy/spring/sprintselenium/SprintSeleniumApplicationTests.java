package com.udemy.spring.sprintselenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SprintSeleniumApplicationTests {

	@Autowired
	private Television tv;

	@Test
	void contextLoads(){
		this.tv.playMovie();
	}

}
