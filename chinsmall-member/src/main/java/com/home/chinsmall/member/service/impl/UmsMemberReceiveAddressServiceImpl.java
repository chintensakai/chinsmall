package com.home.chinsmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.member.dao.UmsMemberReceiveAddressDao;
import com.home.chinsmall.member.entity.UmsMemberReceiveAddressEntity;
import com.home.chinsmall.member.service.UmsMemberReceiveAddressService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("umsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl extends
    ServiceImpl<UmsMemberReceiveAddressDao, UmsMemberReceiveAddressEntity> implements
    UmsMemberReceiveAddressService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<UmsMemberReceiveAddressEntity> page = this.page(
        new Query<UmsMemberReceiveAddressEntity>().getPage(params),
        new QueryWrapper<UmsMemberReceiveAddressEntity>()
    );

    return new PageUtils(page);
  }

}