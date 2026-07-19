package com.cognizant.RESTCountryCodeService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:country.xml")
public class RestCountryCodeServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestCountryCodeServiceApplication.class,args);

	}

}