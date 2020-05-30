package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.SkuSaleAttrValueDao;
import com.home.chinsmall.product.entity.SkuSaleAttrValueEntity;
import com.home.chinsmall.product.service.SkuSaleAttrValueService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("skuSaleAttrValueService")
public class SkuSaleAttrValueServiceImpl extends
    ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity> implements SkuSaleAttrValueService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuSaleAttrValueEntity> page = this.page(
        new Query<SkuSaleAttrValueEntity>().getPage(params),
        new QueryWrapper<SkuSaleAttrValueEntity>()
    );

    return new PageUtils(page);
  }

}