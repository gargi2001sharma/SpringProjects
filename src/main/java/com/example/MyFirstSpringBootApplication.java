package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //includes @Configuration @ComponentScan("com.example") @EnableAutoConfiguration
public class MyFirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringBootApplication.class, args);  
	}

}
