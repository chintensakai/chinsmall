package com.home.chinsmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.member.dao.UmsMemberLevelDao;
import com.home.chinsmall.member.entity.UmsMemberLevelEntity;
import com.home.chinsmall.member.service.UmsMemberLevelService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl extends
    ServiceImpl<UmsMemberLevelDao, UmsMemberLevelEntity> implements UmsMemberLevelService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UmsMemberLevelEntity> page = this.page(
        new Query<UmsMemberLevelEntity>().getPage(params),
        new QueryWrapper<UmsMemberLevelEntity>()
    );

    return new PageUtils(page);
  }

}