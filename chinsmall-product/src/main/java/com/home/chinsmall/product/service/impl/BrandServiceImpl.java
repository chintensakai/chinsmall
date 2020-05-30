package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.BrandDao;
import com.home.chinsmall.product.entity.BrandEntity;
import com.home.chinsmall.product.service.BrandService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<BrandEntity> page = this.page(
        new Query<BrandEntity>().getPage(params),
        new QueryWrapper<BrandEntity>()
    );

    return new PageUtils(page);
  }

}