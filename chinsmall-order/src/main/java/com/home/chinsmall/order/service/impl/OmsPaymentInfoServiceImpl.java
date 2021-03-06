package com.home.chinsmall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.order.dao.OmsPaymentInfoDao;
import com.home.chinsmall.order.entity.OmsPaymentInfoEntity;
import com.home.chinsmall.order.service.OmsPaymentInfoService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl extends
    ServiceImpl<OmsPaymentInfoDao, OmsPaymentInfoEntity> implements OmsPaymentInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OmsPaymentInfoEntity> page = this.page(
        new Query<OmsPaymentInfoEntity>().getPage(params),
        new QueryWrapper<OmsPaymentInfoEntity>()
    );

    return new PageUtils(page);
  }

}