package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsHomeSubjectSpuDao;
import com.home.chinsmall.coupon.entity.SmsHomeSubjectSpuEntity;
import com.home.chinsmall.coupon.service.SmsHomeSubjectSpuService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsHomeSubjectSpuService")
public class SmsHomeSubjectSpuServiceImpl extends
    ServiceImpl<SmsHomeSubjectSpuDao, SmsHomeSubjectSpuEntity> implements SmsHomeSubjectSpuService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsHomeSubjectSpuEntity> page = this.page(
        new Query<SmsHomeSubjectSpuEntity>().getPage(params),
        new QueryWrapper<SmsHomeSubjectSpuEntity>()
    );

    return new PageUtils(page);
  }

}