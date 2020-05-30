package com.home.chinsmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.product.entity.AttrEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 商品属性
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:03
 */
public interface AttrService extends IService<AttrEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

