package com.my.SpringjspDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.my.SpringjspDemo")
public class SpringJspDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJspDemoApplication.class, args);
	}

}
