package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsSeckillSkuRelationDao;
import com.home.chinsmall.coupon.entity.SmsSeckillSkuRelationEntity;
import com.home.chinsmall.coupon.service.SmsSeckillSkuRelationService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsSeckillSkuRelationService")
public class SmsSeckillSkuRelationServiceImpl extends
    ServiceImpl<SmsSeckillSkuRelationDao, SmsSeckillSkuRelationEntity> implements
    SmsSeckillSkuRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsSeckillSkuRelationEntity> page = this.page(
        new Query<SmsSeckillSkuRelationEntity>().getPage(params),
        new QueryWrapper<SmsSeckillSkuRelationEntity>()
    );

    return new PageUtils(page);
  }

}