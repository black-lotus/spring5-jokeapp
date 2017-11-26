package com.dondon.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class JokeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeappApplication.class, args);
	}

}
