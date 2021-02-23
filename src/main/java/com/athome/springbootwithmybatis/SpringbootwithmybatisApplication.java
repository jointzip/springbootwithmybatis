package com.athome.springbootwithmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.athome.springbootwithmybatis.mapper") //扫描的mapper
@SpringBootApplication
public class SpringbootwithmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwithmybatisApplication.class, args);
    }

}
