package com.li.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * create by idea
 *
 * @author LiZJ
 * @date 2019/7/4 14:57
 */


@Configuration
@EnableAutoConfiguration
@ComponentScan("com.li.controller")
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
