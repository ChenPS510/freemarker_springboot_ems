package com.cps.www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cps.www.dao")
public class FreemarkerSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreemarkerSpringbootApplication.class, args);
    }

}
