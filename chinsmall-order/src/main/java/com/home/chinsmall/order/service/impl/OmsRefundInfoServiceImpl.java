package com.home.chinsmall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.order.dao.OmsRefundInfoDao;
import com.home.chinsmall.order.entity.OmsRefundInfoEntity;
import com.home.chinsmall.order.service.OmsRefundInfoService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("omsRefundInfoService")
public class OmsRefundInfoServiceImpl extends
    ServiceImpl<OmsRefundInfoDao, OmsRefundInfoEntity> implements OmsRefundInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OmsRefundInfoEntity> page = this.page(
        new Query<OmsRefundInfoEntity>().getPage(params),
        new QueryWrapper<OmsRefundInfoEntity>()
    );

    return new PageUtils(page);
  }

}