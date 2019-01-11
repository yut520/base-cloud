package com.iyut.base.eureka;

import com.iyut.base.common.util.PrintLogo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author iyut
 */
@SpringBootApplication
@EnableEurekaServer
public class BaseEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseEurekaApplication.class, args);
        PrintLogo.pringfozu();
    }

}

