package com.home.chinsmall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.ware.dao.WmsWareOrderTaskDao;
import com.home.chinsmall.ware.entity.WmsWareOrderTaskEntity;
import com.home.chinsmall.ware.service.WmsWareOrderTaskService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("wmsWareOrderTaskService")
public class WmsWareOrderTaskServiceImpl extends
    ServiceImpl<WmsWareOrderTaskDao, WmsWareOrderTaskEntity> implements WmsWareOrderTaskService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WmsWareOrderTaskEntity> page = this.page(
        new Query<WmsWareOrderTaskEntity>().getPage(params),
        new QueryWrapper<WmsWareOrderTaskEntity>()
    );

    return new PageUtils(page);
  }

}