package com.scheduline.scheduline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SchedulineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulineApplication.class, args);
	}

}
