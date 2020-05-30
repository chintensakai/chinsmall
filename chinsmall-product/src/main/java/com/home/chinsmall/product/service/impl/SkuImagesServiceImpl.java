package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.SkuImagesDao;
import com.home.chinsmall.product.entity.SkuImagesEntity;
import com.home.chinsmall.product.service.SkuImagesService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements
    SkuImagesService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuImagesEntity> page = this.page(
        new Query<SkuImagesEntity>().getPage(params),
        new QueryWrapper<SkuImagesEntity>()
    );

    return new PageUtils(page);
  }

}