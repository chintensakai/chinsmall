package com.home.chinsmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.order.entity.OmsOrderReturnReasonEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 退货原因
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:09:15
 */
public interface OmsOrderReturnReasonService extends IService<OmsOrderReturnReasonEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

