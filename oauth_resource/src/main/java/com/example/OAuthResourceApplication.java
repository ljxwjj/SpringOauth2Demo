package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper")
public class OAuthResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuthResourceApplication.class, args);
    }
}
