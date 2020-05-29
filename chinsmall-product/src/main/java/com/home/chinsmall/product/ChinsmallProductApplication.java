package com.home.chinsmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.home.chinsmall.product.dao")
public class ChinsmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinsmallProductApplication.class, args);
	}

}
