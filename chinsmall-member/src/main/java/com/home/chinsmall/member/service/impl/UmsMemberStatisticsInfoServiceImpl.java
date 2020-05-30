package com.home.chinsmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.member.dao.UmsMemberStatisticsInfoDao;
import com.home.chinsmall.member.entity.UmsMemberStatisticsInfoEntity;
import com.home.chinsmall.member.service.UmsMemberStatisticsInfoService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("umsMemberStatisticsInfoService")
public class UmsMemberStatisticsInfoServiceImpl extends
    ServiceImpl<UmsMemberStatisticsInfoDao, UmsMemberStatisticsInfoEntity> implements
    UmsMemberStatisticsInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UmsMemberStatisticsInfoEntity> page = this.page(
        new Query<UmsMemberStatisticsInfoEntity>().getPage(params),
        new QueryWrapper<UmsMemberStatisticsInfoEntity>()
    );

    return new PageUtils(page);
  }

}