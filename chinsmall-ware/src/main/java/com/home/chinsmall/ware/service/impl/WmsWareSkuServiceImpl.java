package com.home.chinsmall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.ware.dao.WmsWareSkuDao;
import com.home.chinsmall.ware.entity.WmsWareSkuEntity;
import com.home.chinsmall.ware.service.WmsWareSkuService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("wmsWareSkuService")
public class WmsWareSkuServiceImpl extends ServiceImpl<WmsWareSkuDao, WmsWareSkuEntity> implements
    WmsWareSkuService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WmsWareSkuEntity> page = this.page(
        new Query<WmsWareSkuEntity>().getPage(params),
        new QueryWrapper<WmsWareSkuEntity>()
    );

    return new PageUtils(page);
  }

}