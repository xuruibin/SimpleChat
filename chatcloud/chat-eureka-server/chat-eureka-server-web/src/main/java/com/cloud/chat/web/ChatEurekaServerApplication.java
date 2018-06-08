package com.cloud.chat.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author bin
 * 2018/6/7
 */
@EnableEurekaServer
@SpringBootApplication
public class ChatEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatEurekaServerApplication.class, args);
    }
}
