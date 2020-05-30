package com.home.chinsmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.coupon.entity.SmsHomeSubjectSpuEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 专题商品
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
public interface SmsHomeSubjectSpuService extends IService<SmsHomeSubjectSpuEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

