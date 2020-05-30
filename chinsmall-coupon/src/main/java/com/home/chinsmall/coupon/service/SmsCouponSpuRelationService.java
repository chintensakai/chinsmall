package com.home.chinsmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.coupon.entity.SmsCouponSpuRelationEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
public interface SmsCouponSpuRelationService extends IService<SmsCouponSpuRelationEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

