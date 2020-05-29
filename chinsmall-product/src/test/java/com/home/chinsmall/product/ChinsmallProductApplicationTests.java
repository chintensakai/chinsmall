package com.home.chinsmall.product;

import com.home.chinsmall.product.entity.BrandEntity;
import com.home.chinsmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChinsmallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {

		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("huawei");
		boolean save = brandService.save(brandEntity);
		System.out.println("--------------- " + save);
	}

}
