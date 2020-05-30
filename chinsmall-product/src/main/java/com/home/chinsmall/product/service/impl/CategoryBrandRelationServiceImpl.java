package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.CategoryBrandRelationDao;
import com.home.chinsmall.product.entity.CategoryBrandRelationEntity;
import com.home.chinsmall.product.service.CategoryBrandRelationService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("categoryBrandRelationService")
public class CategoryBrandRelationServiceImpl extends
    ServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity> implements
    CategoryBrandRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CategoryBrandRelationEntity> page = this.page(
        new Query<CategoryBrandRelationEntity>().getPage(params),
        new QueryWrapper<CategoryBrandRelationEntity>()
    );

    return new PageUtils(page);
  }

}