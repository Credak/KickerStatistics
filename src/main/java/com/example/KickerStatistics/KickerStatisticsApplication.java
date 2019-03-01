package com.example.KickerStatistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.KickerStatistics.repository")
@SpringBootApplication
public class KickerStatisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KickerStatisticsApplication.class, args);
	}

}
