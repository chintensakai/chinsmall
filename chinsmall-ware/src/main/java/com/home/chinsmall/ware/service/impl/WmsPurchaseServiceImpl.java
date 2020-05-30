package com.home.chinsmall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.ware.dao.WmsPurchaseDao;
import com.home.chinsmall.ware.entity.WmsPurchaseEntity;
import com.home.chinsmall.ware.service.WmsPurchaseService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("wmsPurchaseService")
public class WmsPurchaseServiceImpl extends
    ServiceImpl<WmsPurchaseDao, WmsPurchaseEntity> implements WmsPurchaseService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WmsPurchaseEntity> page = this.page(
        new Query<WmsPurchaseEntity>().getPage(params),
        new QueryWrapper<WmsPurchaseEntity>()
    );

    return new PageUtils(page);
  }

}