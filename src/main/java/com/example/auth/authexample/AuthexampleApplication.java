package com.example.auth.authexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AuthexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthexampleApplication.class, args);
	}

}
