package com.springframework.chucknorisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChucknorisjokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChucknorisjokesApplication.class, args);
    }

}
