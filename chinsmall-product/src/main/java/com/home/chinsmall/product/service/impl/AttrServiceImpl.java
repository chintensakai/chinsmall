package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.AttrDao;
import com.home.chinsmall.product.entity.AttrEntity;
import com.home.chinsmall.product.service.AttrService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<AttrEntity> page = this.page(
        new Query<AttrEntity>().getPage(params),
        new QueryWrapper<AttrEntity>()
    );

    return new PageUtils(page);
  }

}