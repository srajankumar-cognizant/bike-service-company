package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
		info = @Info(
		title = "Bike Service Company", 
		version = "1.0", 
		description = "API documentation for my secured Spring Boot application"
		), 
		security = @SecurityRequirement(name = "BearerAuth") // Apply BearerAuth globally
)

@SecurityScheme(
		name = "BearerAuth", // Name of the security scheme
		type = SecuritySchemeType.HTTP, 
		scheme = "bearer", 
		bearerFormat = "JWT", // Optional, for documentation purposes
		description = "JWT authentication using a Bearer token"
)

// This is the main class that starts the Bike Service application
@SpringBootApplication
public class BikeserviceApplication {

	// This method launches the application
	public static void main(String[] args) {
		SpringApplication.run(BikeserviceApplication.class, args);
	}

}
