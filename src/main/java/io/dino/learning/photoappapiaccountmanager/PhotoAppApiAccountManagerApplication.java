package io.dino.learning.photoappapiaccountmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoAppApiAccountManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppApiAccountManagerApplication.class, args);
    }

}
