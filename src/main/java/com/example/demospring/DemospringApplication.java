package com.example.demospring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableAutoConfiguration
class DemospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemospringApplication.class, args);
    }

}
