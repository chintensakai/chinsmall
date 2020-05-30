package com.home.chinsmall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.ware.dao.WmsPurchaseDetailDao;
import com.home.chinsmall.ware.entity.WmsPurchaseDetailEntity;
import com.home.chinsmall.ware.service.WmsPurchaseDetailService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("wmsPurchaseDetailService")
public class WmsPurchaseDetailServiceImpl extends
    ServiceImpl<WmsPurchaseDetailDao, WmsPurchaseDetailEntity> implements WmsPurchaseDetailService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WmsPurchaseDetailEntity> page = this.page(
        new Query<WmsPurchaseDetailEntity>().getPage(params),
        new QueryWrapper<WmsPurchaseDetailEntity>()
    );

    return new PageUtils(page);
  }

}