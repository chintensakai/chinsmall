package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsSkuFullReductionDao;
import com.home.chinsmall.coupon.entity.SmsSkuFullReductionEntity;
import com.home.chinsmall.coupon.service.SmsSkuFullReductionService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsSkuFullReductionService")
public class SmsSkuFullReductionServiceImpl extends
    ServiceImpl<SmsSkuFullReductionDao, SmsSkuFullReductionEntity> implements
    SmsSkuFullReductionService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsSkuFullReductionEntity> page = this.page(
        new Query<SmsSkuFullReductionEntity>().getPage(params),
        new QueryWrapper<SmsSkuFullReductionEntity>()
    );

    return new PageUtils(page);
  }

}