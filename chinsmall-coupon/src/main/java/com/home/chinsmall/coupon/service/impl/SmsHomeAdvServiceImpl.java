package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsHomeAdvDao;
import com.home.chinsmall.coupon.entity.SmsHomeAdvEntity;
import com.home.chinsmall.coupon.service.SmsHomeAdvService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl extends ServiceImpl<SmsHomeAdvDao, SmsHomeAdvEntity> implements
    SmsHomeAdvService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsHomeAdvEntity> page = this.page(
        new Query<SmsHomeAdvEntity>().getPage(params),
        new QueryWrapper<SmsHomeAdvEntity>()
    );

    return new PageUtils(page);
  }

}