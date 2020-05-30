package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.CategoryDao;
import com.home.chinsmall.product.entity.CategoryEntity;
import com.home.chinsmall.product.service.CategoryService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements
    CategoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CategoryEntity> page = this.page(
        new Query<CategoryEntity>().getPage(params),
        new QueryWrapper<CategoryEntity>()
    );

    return new PageUtils(page);
  }

}