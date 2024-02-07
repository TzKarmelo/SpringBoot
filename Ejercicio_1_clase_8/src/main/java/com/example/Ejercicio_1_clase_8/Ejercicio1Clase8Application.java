package com.example.Ejercicio_1_clase_8;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio1Clase8Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Clase8Application.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info()
				.title("API probando documentacion")
				.version("0.0.1")
				.description("Un ejemplo de como documentar una API"));

	}
}
