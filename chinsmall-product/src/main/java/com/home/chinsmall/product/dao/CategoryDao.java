package com.home.chinsmall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.home.chinsmall.product.entity.CategoryEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 商品三级分类
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
  void logicDeleteByUpdate(List<Long> ids);
}
