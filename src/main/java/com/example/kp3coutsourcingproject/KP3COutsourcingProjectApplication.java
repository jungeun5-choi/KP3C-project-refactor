package com.example.kp3coutsourcingproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class KP3COutsourcingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KP3COutsourcingProjectApplication.class, args);
	}

}
