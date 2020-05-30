package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsSeckillSkuNoticeDao;
import com.home.chinsmall.coupon.entity.SmsSeckillSkuNoticeEntity;
import com.home.chinsmall.coupon.service.SmsSeckillSkuNoticeService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl extends
    ServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNoticeEntity> implements
    SmsSeckillSkuNoticeService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsSeckillSkuNoticeEntity> page = this.page(
        new Query<SmsSeckillSkuNoticeEntity>().getPage(params),
        new QueryWrapper<SmsSeckillSkuNoticeEntity>()
    );

    return new PageUtils(page);
  }

}