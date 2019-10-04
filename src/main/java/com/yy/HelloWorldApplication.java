package com.yy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("springboot start...");
		SpringApplication.run(HelloWorldApplication.class,args);
	}

}
