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
        return "Spring Boot App Successfully Deployed on EKS using ArgoCD ";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
