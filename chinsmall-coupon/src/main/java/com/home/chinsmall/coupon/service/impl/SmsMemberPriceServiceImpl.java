package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsMemberPriceDao;
import com.home.chinsmall.coupon.entity.SmsMemberPriceEntity;
import com.home.chinsmall.coupon.service.SmsMemberPriceService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl extends
    ServiceImpl<SmsMemberPriceDao, SmsMemberPriceEntity> implements SmsMemberPriceService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsMemberPriceEntity> page = this.page(
        new Query<SmsMemberPriceEntity>().getPage(params),
        new QueryWrapper<SmsMemberPriceEntity>()
    );

    return new PageUtils(page);
  }

}