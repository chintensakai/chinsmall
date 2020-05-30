package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.SkuInfoDao;
import com.home.chinsmall.product.entity.SkuInfoEntity;
import com.home.chinsmall.product.service.SkuInfoService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements
    SkuInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuInfoEntity> page = this.page(
        new Query<SkuInfoEntity>().getPage(params),
        new QueryWrapper<SkuInfoEntity>()
    );

    return new PageUtils(page);
  }

}