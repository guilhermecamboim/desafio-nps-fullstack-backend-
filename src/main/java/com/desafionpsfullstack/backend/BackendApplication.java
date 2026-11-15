package com.desafionpsfullstack.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// O exclude de SecurityAutoConfiguration foi removido: o Spring Security não está no classpath e a classe mudou de pacote no Spring Boot 4.
@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
