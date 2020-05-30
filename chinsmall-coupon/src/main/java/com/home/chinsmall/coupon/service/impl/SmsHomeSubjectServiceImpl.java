package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsHomeSubjectDao;
import com.home.chinsmall.coupon.entity.SmsHomeSubjectEntity;
import com.home.chinsmall.coupon.service.SmsHomeSubjectService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsHomeSubjectService")
public class SmsHomeSubjectServiceImpl extends
    ServiceImpl<SmsHomeSubjectDao, SmsHomeSubjectEntity> implements SmsHomeSubjectService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsHomeSubjectEntity> page = this.page(
        new Query<SmsHomeSubjectEntity>().getPage(params),
        new QueryWrapper<SmsHomeSubjectEntity>()
    );

    return new PageUtils(page);
  }

}