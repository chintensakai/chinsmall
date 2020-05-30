package com.home.chinsmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.home.chinsmall.coupon.dao")
public class ChinsmallCouponApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChinsmallCouponApplication.class, args);
  }

}
