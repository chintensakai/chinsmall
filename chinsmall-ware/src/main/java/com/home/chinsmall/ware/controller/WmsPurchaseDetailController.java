package com.home.chinsmall.ware.controller;

import com.home.chinsmall.ware.entity.WmsPurchaseDetailEntity;
import com.home.chinsmall.ware.service.WmsPurchaseDetailService;
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
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:22:59
 */
@RestController
@RequestMapping("ware/wmspurchasedetail")
public class WmsPurchaseDetailController {

  @Autowired
  private WmsPurchaseDetailService wmsPurchaseDetailService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("ware:wmspurchasedetail:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = wmsPurchaseDetailService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("ware:wmspurchasedetail:info")
  public R info(@PathVariable("id") Long id) {
    WmsPurchaseDetailEntity wmsPurchaseDetail = wmsPurchaseDetailService.getById(id);

    return R.ok().put("wmsPurchaseDetail", wmsPurchaseDetail);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("ware:wmspurchasedetail:save")
  public R save(@RequestBody WmsPurchaseDetailEntity wmsPurchaseDetail) {
    wmsPurchaseDetailService.save(wmsPurchaseDetail);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("ware:wmspurchasedetail:update")
  public R update(@RequestBody WmsPurchaseDetailEntity wmsPurchaseDetail) {
    wmsPurchaseDetailService.updateById(wmsPurchaseDetail);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("ware:wmspurchasedetail:delete")
  public R delete(@RequestBody Long[] ids) {
    wmsPurchaseDetailService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
