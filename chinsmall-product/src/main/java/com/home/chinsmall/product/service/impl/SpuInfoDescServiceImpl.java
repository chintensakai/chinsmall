package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.SpuInfoDescDao;
import com.home.chinsmall.product.entity.SpuInfoDescEntity;
import com.home.chinsmall.product.service.SpuInfoDescService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends
    ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SpuInfoDescEntity> page = this.page(
        new Query<SpuInfoDescEntity>().getPage(params),
        new QueryWrapper<SpuInfoDescEntity>()
    );

    return new PageUtils(page);
  }

}