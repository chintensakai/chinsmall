package com.home.chinsmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.common.utils.PageUtils;
import com.home.chinsmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:02
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

