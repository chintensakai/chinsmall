package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsSkuLadderDao;
import com.home.chinsmall.coupon.entity.SmsSkuLadderEntity;
import com.home.chinsmall.coupon.service.SmsSkuLadderService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsSkuLadderService")
public class SmsSkuLadderServiceImpl extends
    ServiceImpl<SmsSkuLadderDao, SmsSkuLadderEntity> implements SmsSkuLadderService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsSkuLadderEntity> page = this.page(
        new Query<SmsSkuLadderEntity>().getPage(params),
        new QueryWrapper<SmsSkuLadderEntity>()
    );

    return new PageUtils(page);
  }

}