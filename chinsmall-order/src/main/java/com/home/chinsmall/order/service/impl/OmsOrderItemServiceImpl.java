package com.home.chinsmall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.order.dao.OmsOrderItemDao;
import com.home.chinsmall.order.entity.OmsOrderItemEntity;
import com.home.chinsmall.order.service.OmsOrderItemService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl extends
    ServiceImpl<OmsOrderItemDao, OmsOrderItemEntity> implements OmsOrderItemService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OmsOrderItemEntity> page = this.page(
        new Query<OmsOrderItemEntity>().getPage(params),
        new QueryWrapper<OmsOrderItemEntity>()
    );

    return new PageUtils(page);
  }

}