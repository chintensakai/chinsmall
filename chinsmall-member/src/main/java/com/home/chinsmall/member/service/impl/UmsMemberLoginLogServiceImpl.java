package com.home.chinsmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.member.dao.UmsMemberLoginLogDao;
import com.home.chinsmall.member.entity.UmsMemberLoginLogEntity;
import com.home.chinsmall.member.service.UmsMemberLoginLogService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl extends
    ServiceImpl<UmsMemberLoginLogDao, UmsMemberLoginLogEntity> implements UmsMemberLoginLogService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UmsMemberLoginLogEntity> page = this.page(
        new Query<UmsMemberLoginLogEntity>().getPage(params),
        new QueryWrapper<UmsMemberLoginLogEntity>()
    );

    return new PageUtils(page);
  }

}