package com.home.chinsmall.ware.controller;

import com.home.chinsmall.ware.entity.WmsPurchaseEntity;
import com.home.chinsmall.ware.service.WmsPurchaseService;
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
 * 采购信息
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:22:59
 */
@RestController
@RequestMapping("ware/wmspurchase")
public class WmsPurchaseController {

  @Autowired
  private WmsPurchaseService wmsPurchaseService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("ware:wmspurchase:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = wmsPurchaseService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("ware:wmspurchase:info")
  public R info(@PathVariable("id") Long id) {
    WmsPurchaseEntity wmsPurchase = wmsPurchaseService.getById(id);

    return R.ok().put("wmsPurchase", wmsPurchase);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("ware:wmspurchase:save")
  public R save(@RequestBody WmsPurchaseEntity wmsPurchase) {
    wmsPurchaseService.save(wmsPurchase);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("ware:wmspurchase:update")
  public R update(@RequestBody WmsPurchaseEntity wmsPurchase) {
    wmsPurchaseService.updateById(wmsPurchase);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("ware:wmspurchase:delete")
  public R delete(@RequestBody Long[] ids) {
    wmsPurchaseService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
