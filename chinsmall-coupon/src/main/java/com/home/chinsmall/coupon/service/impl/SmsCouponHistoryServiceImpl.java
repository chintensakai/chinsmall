package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsCouponHistoryDao;
import com.home.chinsmall.coupon.entity.SmsCouponHistoryEntity;
import com.home.chinsmall.coupon.service.SmsCouponHistoryService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl extends
    ServiceImpl<SmsCouponHistoryDao, SmsCouponHistoryEntity> implements SmsCouponHistoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsCouponHistoryEntity> page = this.page(
        new Query<SmsCouponHistoryEntity>().getPage(params),
        new QueryWrapper<SmsCouponHistoryEntity>()
    );

    return new PageUtils(page);
  }

}