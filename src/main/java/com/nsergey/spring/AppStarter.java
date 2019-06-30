package com.nsergey.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AppStarter {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AppStarter.class).run(args);
    }

}
