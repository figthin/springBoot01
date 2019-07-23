package com.hwua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:applicationContext.xml")
public class SpringBoot01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01Application.class,args);
    }

}
