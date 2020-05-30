package com.home.chinsmall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.order.dao.OmsOrderSettingDao;
import com.home.chinsmall.order.entity.OmsOrderSettingEntity;
import com.home.chinsmall.order.service.OmsOrderSettingService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl extends
    ServiceImpl<OmsOrderSettingDao, OmsOrderSettingEntity> implements OmsOrderSettingService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<OmsOrderSettingEntity> page = this.page(
        new Query<OmsOrderSettingEntity>().getPage(params),
        new QueryWrapper<OmsOrderSettingEntity>()
    );

    return new PageUtils(page);
  }

}