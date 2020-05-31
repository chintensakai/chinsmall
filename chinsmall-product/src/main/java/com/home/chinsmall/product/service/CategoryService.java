package com.home.chinsmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.product.entity.CategoryEntity;
import com.home.common.utils.PageUtils;
import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:03
 */
public interface CategoryService extends IService<CategoryEntity> {

  PageUtils queryPage(Map<String, Object> params);

  List<CategoryEntity> listWithTree();
}

