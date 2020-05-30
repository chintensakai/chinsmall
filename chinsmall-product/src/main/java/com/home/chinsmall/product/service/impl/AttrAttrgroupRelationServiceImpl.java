package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.AttrAttrgroupRelationDao;
import com.home.chinsmall.product.entity.AttrAttrgroupRelationEntity;
import com.home.chinsmall.product.service.AttrAttrgroupRelationService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends
    ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements
    AttrAttrgroupRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<AttrAttrgroupRelationEntity> page = this.page(
        new Query<AttrAttrgroupRelationEntity>().getPage(params),
        new QueryWrapper<AttrAttrgroupRelationEntity>()
    );

    return new PageUtils(page);
  }

}