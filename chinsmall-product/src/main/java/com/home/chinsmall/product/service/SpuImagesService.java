package com.home.chinsmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.product.entity.SpuImagesEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * spu图片
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:03
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

