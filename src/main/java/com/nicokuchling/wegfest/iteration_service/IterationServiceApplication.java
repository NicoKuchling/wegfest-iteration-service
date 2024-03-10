package com.nicokuchling.wegfest.iteration_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nicokuchling.wegfest")
public class IterationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IterationServiceApplication.class, args);
    }

}
