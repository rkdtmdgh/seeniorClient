package com.see_nior.seeniorClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SeeniorClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeeniorClientApplication.class, args);
	}

}
