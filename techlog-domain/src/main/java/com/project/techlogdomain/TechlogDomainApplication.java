package com.project.techlogdomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TechlogDomainApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechlogDomainApplication.class, args);
    }

}
