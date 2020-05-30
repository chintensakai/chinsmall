package com.home.chinsmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.member.dao.UmsMemberDao;
import com.home.chinsmall.member.entity.UmsMemberEntity;
import com.home.chinsmall.member.service.UmsMemberService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("umsMemberService")
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberDao, UmsMemberEntity> implements
    UmsMemberService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UmsMemberEntity> page = this.page(
        new Query<UmsMemberEntity>().getPage(params),
        new QueryWrapper<UmsMemberEntity>()
    );

    return new PageUtils(page);
  }

}