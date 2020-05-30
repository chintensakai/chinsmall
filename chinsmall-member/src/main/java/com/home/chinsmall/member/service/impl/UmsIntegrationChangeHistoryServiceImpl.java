package com.home.chinsmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.member.dao.UmsIntegrationChangeHistoryDao;
import com.home.chinsmall.member.entity.UmsIntegrationChangeHistoryEntity;
import com.home.chinsmall.member.service.UmsIntegrationChangeHistoryService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("umsIntegrationChangeHistoryService")
public class UmsIntegrationChangeHistoryServiceImpl extends
    ServiceImpl<UmsIntegrationChangeHistoryDao, UmsIntegrationChangeHistoryEntity> implements
    UmsIntegrationChangeHistoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UmsIntegrationChangeHistoryEntity> page = this.page(
        new Query<UmsIntegrationChangeHistoryEntity>().getPage(params),
        new QueryWrapper<UmsIntegrationChangeHistoryEntity>()
    );

    return new PageUtils(page);
  }

}