package com.home.chinsmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.home.chinsmall.member.dao")
public class ChinsmallMemberApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChinsmallMemberApplication.class, args);
  }

}
