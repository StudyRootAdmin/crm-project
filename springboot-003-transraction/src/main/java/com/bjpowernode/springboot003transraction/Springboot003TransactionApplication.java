package com.bjpowernode.springboot003transraction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages="com.bjpowernode.dao")
public class Springboot003TransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot003TransactionApplication.class, args);
    }

}
