package com.learntech.horsefacts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class HorsefactsApplication {
    public static void main(String[] args) {
        SpringApplication.run(HorsefactsApplication.class, args);
    }
}
