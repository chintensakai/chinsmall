package com.home.chinsmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.coupon.entity.SmsMemberPriceEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 商品会员价格
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
public interface SmsMemberPriceService extends IService<SmsMemberPriceEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

