package com.wingsmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan
public class EnverbApplication {
	public static void main(String[] args) {
		SpringApplication.run(EnverbApplication.class, args);
	}
}
