package com.home.chinsmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.member.dao.UmsMemberCollectSubjectDao;
import com.home.chinsmall.member.entity.UmsMemberCollectSubjectEntity;
import com.home.chinsmall.member.service.UmsMemberCollectSubjectService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("umsMemberCollectSubjectService")
public class UmsMemberCollectSubjectServiceImpl extends
    ServiceImpl<UmsMemberCollectSubjectDao, UmsMemberCollectSubjectEntity> implements
    UmsMemberCollectSubjectService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UmsMemberCollectSubjectEntity> page = this.page(
        new Query<UmsMemberCollectSubjectEntity>().getPage(params),
        new QueryWrapper<UmsMemberCollectSubjectEntity>()
    );

    return new PageUtils(page);
  }

}