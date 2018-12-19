package com.iyut.base.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.iyut.base.user.mapper")
public class BaseUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseUserApplication.class, args);
    }

}

