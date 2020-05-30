package com.home.chinsmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.coupon.dao.SmsCouponSpuCategoryRelationDao;
import com.home.chinsmall.coupon.entity.SmsCouponSpuCategoryRelationEntity;
import com.home.chinsmall.coupon.service.SmsCouponSpuCategoryRelationService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl extends
    ServiceImpl<SmsCouponSpuCategoryRelationDao, SmsCouponSpuCategoryRelationEntity> implements
    SmsCouponSpuCategoryRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SmsCouponSpuCategoryRelationEntity> page = this.page(
        new Query<SmsCouponSpuCategoryRelationEntity>().getPage(params),
        new QueryWrapper<SmsCouponSpuCategoryRelationEntity>()
    );

    return new PageUtils(page);
  }

}