package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsCouponDao;
import com.home.chinsmall.coupon.entity.SmsCouponEntity;
import com.home.chinsmall.coupon.service.SmsCouponService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsCouponService")
public class SmsCouponServiceImpl extends ServiceImpl<SmsCouponDao, SmsCouponEntity> implements
    SmsCouponService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsCouponEntity> page = this.page(
        new Query<SmsCouponEntity>().getPage(params),
        new QueryWrapper<SmsCouponEntity>()
    );

    return new PageUtils(page);
  }

}