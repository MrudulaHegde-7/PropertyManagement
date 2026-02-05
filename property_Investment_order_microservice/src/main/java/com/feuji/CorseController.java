package com.feuji;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class CorseController {

	@SuppressWarnings("deprecation")
	@Bean
	public WebMvcConfigurer corsesonfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("http://localhost:4200/")
						.allowedHeaders("*");
			}
		};
	}
}


//This code enables CORS in a Spring Boot backend so that an Angular frontend (running on localhost:4200) 
//can communicate with it. It allows GET, POST, PUT, and DELETE requests, but only from that specific origin.