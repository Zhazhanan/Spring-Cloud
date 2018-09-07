package com.example.projectmonitoring;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
public class ProjectMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMonitoringApplication.class, args);
	}
}
