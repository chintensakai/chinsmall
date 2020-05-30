package com.home.chinsmall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.ware.dao.WmsWareInfoDao;
import com.home.chinsmall.ware.entity.WmsWareInfoEntity;
import com.home.chinsmall.ware.service.WmsWareInfoService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("wmsWareInfoService")
public class WmsWareInfoServiceImpl extends
    ServiceImpl<WmsWareInfoDao, WmsWareInfoEntity> implements WmsWareInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WmsWareInfoEntity> page = this.page(
        new Query<WmsWareInfoEntity>().getPage(params),
        new QueryWrapper<WmsWareInfoEntity>()
    );

    return new PageUtils(page);
  }

}