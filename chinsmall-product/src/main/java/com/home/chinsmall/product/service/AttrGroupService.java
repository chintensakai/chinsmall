package com.home.chinsmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.product.entity.AttrGroupEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 属性分组
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:02
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

