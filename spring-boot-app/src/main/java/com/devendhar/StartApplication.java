package com.devendhar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StartApplication {

    @GetMapping("/")
    public String home() {
        return "Spring Boot running on EKS via ArgoCD 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
