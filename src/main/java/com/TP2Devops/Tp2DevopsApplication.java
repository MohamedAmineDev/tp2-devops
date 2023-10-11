package com.TP2Devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tp2DevopsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp2DevopsApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "<h1>Hello World !</h1>";
    }
}
