package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsSpuBoundsDao;
import com.home.chinsmall.coupon.entity.SmsSpuBoundsEntity;
import com.home.chinsmall.coupon.service.SmsSpuBoundsService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsSpuBoundsService")
public class SmsSpuBoundsServiceImpl extends
    ServiceImpl<SmsSpuBoundsDao, SmsSpuBoundsEntity> implements SmsSpuBoundsService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsSpuBoundsEntity> page = this.page(
        new Query<SmsSpuBoundsEntity>().getPage(params),
        new QueryWrapper<SmsSpuBoundsEntity>()
    );

    return new PageUtils(page);
  }

}