package com.virtualpet.virtualpetspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class VirtualPetSpringApplication extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VirtualPetSpringApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(VirtualPetSpringApplication.class, args);
	}
}
