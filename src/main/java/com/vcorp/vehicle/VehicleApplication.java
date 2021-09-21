package com.vcorp.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class VehicleApplication /*implements WebMvcConfigurer*/ {

	public static void main(String[] args) {
		SpringApplication.run(VehicleApplication.class, args);
	}
	
	/*@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("GET", "POST");
	}*/

}
