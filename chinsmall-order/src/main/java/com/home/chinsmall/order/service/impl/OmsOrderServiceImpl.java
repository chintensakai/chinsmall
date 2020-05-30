package com.home.chinsmall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.order.dao.OmsOrderDao;
import com.home.chinsmall.order.entity.OmsOrderEntity;
import com.home.chinsmall.order.service.OmsOrderService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("omsOrderService")
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderDao, OmsOrderEntity> implements
    OmsOrderService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OmsOrderEntity> page = this.page(
        new Query<OmsOrderEntity>().getPage(params),
        new QueryWrapper<OmsOrderEntity>()
    );

    return new PageUtils(page);
  }

}