package com.home.chinsmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.home.chinsmall.order.dao")
public class ChinsmallOrderApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChinsmallOrderApplication.class, args);
  }

}
