package com.home.chinsmall.product.dao;

import com.home.chinsmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
