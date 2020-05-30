package com.home.chinsmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.ware.entity.WmsWareOrderTaskDetailEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 库存工作单
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:22:59
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetailEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

