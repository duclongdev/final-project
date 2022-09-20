package com.example.currencycalculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyCalculationApp {
    public static void main(String[] args) {
        SpringApplication.run(CurrencyCalculationApp.class, args);
    }
}
