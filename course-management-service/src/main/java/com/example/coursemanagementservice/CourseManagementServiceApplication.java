package com.example.coursemanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.example")
public class CourseManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseManagementServiceApplication.class, args);
	}

}
