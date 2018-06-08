package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bin
 * 2018/6/7
 */
@EnableEurekaClient
@SpringBootApplication
public class ChatEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatEurekaClientApplication.class, args);
    }
}
