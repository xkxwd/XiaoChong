package com.example.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.example.homework.controller.*;



@SpringBootApplication
public class HomeworkApplication {
	public static void main(String[] args) {
		SpringApplication.run(HomeworkApplication.class, args);
	}

}

