package com.home.chinsmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.order.entity.OmsOrderReturnApplyEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 订单退货申请
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:09:15
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

