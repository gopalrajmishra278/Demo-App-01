package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo01App1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run=SpringApplication.run(Demo01App1Application.class, args);
		
		run.close();
		
	}

}
