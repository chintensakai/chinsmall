package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsSeckillSessionDao;
import com.home.chinsmall.coupon.entity.SmsSeckillSessionEntity;
import com.home.chinsmall.coupon.service.SmsSeckillSessionService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl extends
    ServiceImpl<SmsSeckillSessionDao, SmsSeckillSessionEntity> implements SmsSeckillSessionService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsSeckillSessionEntity> page = this.page(
        new Query<SmsSeckillSessionEntity>().getPage(params),
        new QueryWrapper<SmsSeckillSessionEntity>()
    );

    return new PageUtils(page);
  }

}