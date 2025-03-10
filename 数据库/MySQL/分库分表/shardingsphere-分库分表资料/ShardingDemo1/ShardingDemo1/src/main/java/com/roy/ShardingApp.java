package com.roy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author roy
 * @date 2022/3/27
 * @desc
 */
@SpringBootApplication
@MapperScan("com.roy.mapper")
public class ShardingApp {

    public static void main(String[] args) {
        SpringApplication.run(ShardingApp.class,args);
    }
}
