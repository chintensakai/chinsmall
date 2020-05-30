package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.SpuImagesDao;
import com.home.chinsmall.product.entity.SpuImagesEntity;
import com.home.chinsmall.product.service.SpuImagesService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements
    SpuImagesService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SpuImagesEntity> page = this.page(
        new Query<SpuImagesEntity>().getPage(params),
        new QueryWrapper<SpuImagesEntity>()
    );

    return new PageUtils(page);
  }

}