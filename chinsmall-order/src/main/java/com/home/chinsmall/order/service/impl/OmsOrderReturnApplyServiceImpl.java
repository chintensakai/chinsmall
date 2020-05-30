package com.home.chinsmall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.order.dao.OmsOrderReturnApplyDao;
import com.home.chinsmall.order.entity.OmsOrderReturnApplyEntity;
import com.home.chinsmall.order.service.OmsOrderReturnApplyService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl extends
    ServiceImpl<OmsOrderReturnApplyDao, OmsOrderReturnApplyEntity> implements
    OmsOrderReturnApplyService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OmsOrderReturnApplyEntity> page = this.page(
        new Query<OmsOrderReturnApplyEntity>().getPage(params),
        new QueryWrapper<OmsOrderReturnApplyEntity>()
    );

    return new PageUtils(page);
  }

}