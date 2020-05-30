package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.AttrGroupDao;
import com.home.chinsmall.product.entity.AttrGroupEntity;
import com.home.chinsmall.product.service.AttrGroupService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements
    AttrGroupService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<AttrGroupEntity> page = this.page(
        new Query<AttrGroupEntity>().getPage(params),
        new QueryWrapper<AttrGroupEntity>()
    );

    return new PageUtils(page);
  }

}