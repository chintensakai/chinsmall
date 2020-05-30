package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.SpuCommentDao;
import com.home.chinsmall.product.entity.SpuCommentEntity;
import com.home.chinsmall.product.service.SpuCommentService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements
    SpuCommentService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SpuCommentEntity> page = this.page(
        new Query<SpuCommentEntity>().getPage(params),
        new QueryWrapper<SpuCommentEntity>()
    );

    return new PageUtils(page);
  }

}