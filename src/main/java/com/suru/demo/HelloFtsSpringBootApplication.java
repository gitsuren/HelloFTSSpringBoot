package com.suru.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.suru")
@ImportResource("classpath:spring/application-config.xml")
@ConfigurationProperties(locations = "classpath:application.properties")
public class HelloFtsSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloFtsSpringBootApplication.class, args);
    }
}
