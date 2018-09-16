package com.welitonmartins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EventoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoApiApplication.class, args);
		
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
}
