package com.home.chinsmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.home.chinsmall.member.feign")
@MapperScan("com.home.chinsmall.member.dao")
public class ChinsmallMemberApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChinsmallMemberApplication.class, args);
  }

}
