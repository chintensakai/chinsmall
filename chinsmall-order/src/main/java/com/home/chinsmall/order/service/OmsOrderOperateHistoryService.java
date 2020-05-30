package com.home.chinsmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.order.entity.OmsOrderOperateHistoryEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:09:15
 */
public interface OmsOrderOperateHistoryService extends IService<OmsOrderOperateHistoryEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

