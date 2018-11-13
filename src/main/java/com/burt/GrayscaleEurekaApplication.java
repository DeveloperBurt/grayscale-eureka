package com.burt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GrayscaleEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrayscaleEurekaApplication.class, args);
    }
}
