package com.home.chinsmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.coupon.entity.SmsSpuBoundsEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
public interface SmsSpuBoundsService extends IService<SmsSpuBoundsEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

