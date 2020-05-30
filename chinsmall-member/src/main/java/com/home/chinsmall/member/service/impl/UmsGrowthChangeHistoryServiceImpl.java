package com.home.chinsmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.member.dao.UmsGrowthChangeHistoryDao;
import com.home.chinsmall.member.entity.UmsGrowthChangeHistoryEntity;
import com.home.chinsmall.member.service.UmsGrowthChangeHistoryService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("umsGrowthChangeHistoryService")
public class UmsGrowthChangeHistoryServiceImpl extends
    ServiceImpl<UmsGrowthChangeHistoryDao, UmsGrowthChangeHistoryEntity> implements
    UmsGrowthChangeHistoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UmsGrowthChangeHistoryEntity> page = this.page(
        new Query<UmsGrowthChangeHistoryEntity>().getPage(params),
        new QueryWrapper<UmsGrowthChangeHistoryEntity>()
    );

    return new PageUtils(page);
  }

}