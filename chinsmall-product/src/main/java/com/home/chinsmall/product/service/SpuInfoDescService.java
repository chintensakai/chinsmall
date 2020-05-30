package com.home.chinsmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.product.entity.SpuInfoDescEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * spu信息介绍
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:02
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

