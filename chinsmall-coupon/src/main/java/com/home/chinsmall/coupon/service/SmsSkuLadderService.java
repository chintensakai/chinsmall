package com.home.chinsmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.coupon.entity.SmsSkuLadderEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
public interface SmsSkuLadderService extends IService<SmsSkuLadderEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

