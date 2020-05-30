package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.ProductAttrValueDao;
import com.home.chinsmall.product.entity.ProductAttrValueEntity;
import com.home.chinsmall.product.service.ProductAttrValueService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends
    ServiceImpl<ProductAttrValueDao, ProductAttrValueEntity> implements ProductAttrValueService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<ProductAttrValueEntity> page = this.page(
        new Query<ProductAttrValueEntity>().getPage(params),
        new QueryWrapper<ProductAttrValueEntity>()
    );

    return new PageUtils(page);
  }

}