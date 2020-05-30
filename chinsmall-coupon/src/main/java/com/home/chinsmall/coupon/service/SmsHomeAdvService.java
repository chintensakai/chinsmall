package com.home.chinsmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.coupon.entity.SmsHomeAdvEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
public interface SmsHomeAdvService extends IService<SmsHomeAdvEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

