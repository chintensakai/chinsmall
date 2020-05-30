package com.home.chinsmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.product.entity.AttrAttrgroupRelationEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:03
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

