package com.example.kubernates_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class KubernatesDemoApplication {

	@GetMapping("/hi")
	public String test(){
		return "welcome to kubernates";
	}

	public static void main(String[] args) {
		SpringApplication.run(KubernatesDemoApplication.class, args);
	}

}
