package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsCouponSpuRelationDao;
import com.home.chinsmall.coupon.entity.SmsCouponSpuRelationEntity;
import com.home.chinsmall.coupon.service.SmsCouponSpuRelationService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl extends
    ServiceImpl<SmsCouponSpuRelationDao, SmsCouponSpuRelationEntity> implements
    SmsCouponSpuRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsCouponSpuRelationEntity> page = this.page(
        new Query<SmsCouponSpuRelationEntity>().getPage(params),
        new QueryWrapper<SmsCouponSpuRelationEntity>()
    );

    return new PageUtils(page);
  }

}