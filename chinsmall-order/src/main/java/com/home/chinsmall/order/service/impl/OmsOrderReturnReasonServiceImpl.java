package com.home.chinsmall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.order.dao.OmsOrderReturnReasonDao;
import com.home.chinsmall.order.entity.OmsOrderReturnReasonEntity;
import com.home.chinsmall.order.service.OmsOrderReturnReasonService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends
    ServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReasonEntity> implements
    OmsOrderReturnReasonService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OmsOrderReturnReasonEntity> page = this.page(
        new Query<OmsOrderReturnReasonEntity>().getPage(params),
        new QueryWrapper<OmsOrderReturnReasonEntity>()
    );

    return new PageUtils(page);
  }

}