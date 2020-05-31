package com.home.chinsmall.product.controller;

import com.home.chinsmall.product.entity.CategoryEntity;
import com.home.chinsmall.product.service.CategoryService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 商品三级分类
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:43:26
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {

  @Autowired
  private CategoryService categoryService;

  /**
   * 以树形结构返回分类列表
   */
  @RequestMapping("/list/tree")
//    @RequiresPermissions("product:category:list")
  public R list(@RequestParam Map<String, Object> params) {
    List<CategoryEntity> list = categoryService.listWithTree();

    return R.ok().put("data", list);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{catId}")
  // @RequiresPermissions("product:category:info")
  public R info(@PathVariable("catId") Long catId) {
    CategoryEntity category = categoryService.getById(catId);

    return R.ok().put("category", category);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("product:category:save")
  public R save(@RequestBody CategoryEntity category) {
    categoryService.save(category);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("product:category:update")
  public R update(@RequestBody CategoryEntity category) {
    categoryService.updateById(category);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("product:category:delete")
  public R delete(@RequestBody Long[] catIds) {
    categoryService.removeByIds(Arrays.asList(catIds));

    return R.ok();
  }

}
