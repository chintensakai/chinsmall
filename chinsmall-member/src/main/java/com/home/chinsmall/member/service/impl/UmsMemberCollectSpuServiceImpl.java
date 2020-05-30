package com.home.chinsmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.member.dao.UmsMemberCollectSpuDao;
import com.home.chinsmall.member.entity.UmsMemberCollectSpuEntity;
import com.home.chinsmall.member.service.UmsMemberCollectSpuService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl extends
    ServiceImpl<UmsMemberCollectSpuDao, UmsMemberCollectSpuEntity> implements
    UmsMemberCollectSpuService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UmsMemberCollectSpuEntity> page = this.page(
        new Query<UmsMemberCollectSpuEntity>().getPage(params),
        new QueryWrapper<UmsMemberCollectSpuEntity>()
    );

    return new PageUtils(page);
  }

}