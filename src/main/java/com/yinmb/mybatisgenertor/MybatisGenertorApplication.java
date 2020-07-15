package com.yinmb.mybatisgenertor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.yinmb.mybatisgenertor.mysql.mapper")
public class MybatisGenertorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGenertorApplication.class, args);
    }

}
