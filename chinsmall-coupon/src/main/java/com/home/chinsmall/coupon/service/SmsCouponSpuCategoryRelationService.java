package com.home.chinsmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.coupon.entity.SmsCouponSpuCategoryRelationEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
public interface SmsCouponSpuCategoryRelationService extends
    IService<SmsCouponSpuCategoryRelationEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

