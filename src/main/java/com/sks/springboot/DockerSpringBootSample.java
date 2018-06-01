package com.sks.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DockerSpringBootSample {

	
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootSample.class, args);
	}
	
	
}
