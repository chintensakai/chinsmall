package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsSeckillPromotionDao;
import com.home.chinsmall.coupon.entity.SmsSeckillPromotionEntity;
import com.home.chinsmall.coupon.service.SmsSeckillPromotionService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsSeckillPromotionService")
public class SmsSeckillPromotionServiceImpl extends
    ServiceImpl<SmsSeckillPromotionDao, SmsSeckillPromotionEntity> implements
    SmsSeckillPromotionService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsSeckillPromotionEntity> page = this.page(
        new Query<SmsSeckillPromotionEntity>().getPage(params),
        new QueryWrapper<SmsSeckillPromotionEntity>()
    );

    return new PageUtils(page);
  }

}