package com.coderscampus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.FileService;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		FileService fileService = new FileService();
		List<String> values = fileService.readline();
		for (String value : values) {
			System.out.println(value);
		}

	}

}
