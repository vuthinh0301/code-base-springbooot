package com.atomic.theaichemist;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "The AIchemist REST API", version = "1.0", description = "Base API documentation"))
public class TheAIChemistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheAIChemistApplication.class, args);
	}

}
