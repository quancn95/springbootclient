package com.fre18.qnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fre18.qnt")
public class SpringbootclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootclientApplication.class, args);
	}
}
