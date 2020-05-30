package com.home.chinsmall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.ware.dao.WmsWareOrderTaskDetailDao;
import com.home.chinsmall.ware.entity.WmsWareOrderTaskDetailEntity;
import com.home.chinsmall.ware.service.WmsWareOrderTaskDetailService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("wmsWareOrderTaskDetailService")
public class WmsWareOrderTaskDetailServiceImpl extends
    ServiceImpl<WmsWareOrderTaskDetailDao, WmsWareOrderTaskDetailEntity> implements
    WmsWareOrderTaskDetailService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WmsWareOrderTaskDetailEntity> page = this.page(
        new Query<WmsWareOrderTaskDetailEntity>().getPage(params),
        new QueryWrapper<WmsWareOrderTaskDetailEntity>()
    );

    return new PageUtils(page);
  }

}