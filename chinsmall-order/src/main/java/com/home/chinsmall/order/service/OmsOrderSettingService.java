package com.home.chinsmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.order.entity.OmsOrderSettingEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 订单配置信息
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:09:15
 */
public interface OmsOrderSettingService extends IService<OmsOrderSettingEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

