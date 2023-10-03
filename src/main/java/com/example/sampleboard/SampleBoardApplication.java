package com.example.sampleboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SampleBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleBoardApplication.class, args);
    }

}
