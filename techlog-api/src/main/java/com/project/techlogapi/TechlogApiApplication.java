package com.project.techlogapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = "com.project.techlog")
public class TechlogApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechlogApiApplication.class, args);
    }

}
