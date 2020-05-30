package com.home.chinsmall.product.controller;

import com.home.chinsmall.product.entity.SpuCommentEntity;
import com.home.chinsmall.product.service.SpuCommentService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.R;
import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 商品评价
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:43:26
 */
@RestController
@RequestMapping("product/spucomment")
public class SpuCommentController {

  @Autowired
  private SpuCommentService spuCommentService;

  /**
   * 列表
   */
  @RequestMapping("/list")
//    @RequiresPermissions("product:spucomment:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = spuCommentService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("product:spucomment:info")
  public R info(@PathVariable("id") Long id) {
    SpuCommentEntity spuComment = spuCommentService.getById(id);

    return R.ok().put("spuComment", spuComment);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("product:spucomment:save")
  public R save(@RequestBody SpuCommentEntity spuComment) {
    spuCommentService.save(spuComment);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("product:spucomment:update")
  public R update(@RequestBody SpuCommentEntity spuComment) {
    spuCommentService.updateById(spuComment);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("product:spucomment:delete")
  public R delete(@RequestBody Long[] ids) {
    spuCommentService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
