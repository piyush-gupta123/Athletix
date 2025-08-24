package com.athletix.Athletix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class AthletixApplication {

	public static void main(String[] args) {
		SpringApplication.run(AthletixApplication.class, args);
		System.out.println("Started Athletix application");
	}

}
