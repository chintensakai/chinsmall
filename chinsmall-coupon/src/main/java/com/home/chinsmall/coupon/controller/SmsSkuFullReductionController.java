package com.home.chinsmall.coupon.controller;

import com.home.chinsmall.coupon.entity.SmsSkuFullReductionEntity;
import com.home.chinsmall.coupon.service.SmsSkuFullReductionService;
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
 * 商品满减信息
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
@RestController
@RequestMapping("coupon/smsskufullreduction")
public class SmsSkuFullReductionController {

  @Autowired
  private SmsSkuFullReductionService smsSkuFullReductionService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("coupon:smsskufullreduction:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = smsSkuFullReductionService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("coupon:smsskufullreduction:info")
  public R info(@PathVariable("id") Long id) {
    SmsSkuFullReductionEntity smsSkuFullReduction = smsSkuFullReductionService.getById(id);

    return R.ok().put("smsSkuFullReduction", smsSkuFullReduction);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("coupon:smsskufullreduction:save")
  public R save(@RequestBody SmsSkuFullReductionEntity smsSkuFullReduction) {
    smsSkuFullReductionService.save(smsSkuFullReduction);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("coupon:smsskufullreduction:update")
  public R update(@RequestBody SmsSkuFullReductionEntity smsSkuFullReduction) {
    smsSkuFullReductionService.updateById(smsSkuFullReduction);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("coupon:smsskufullreduction:delete")
  public R delete(@RequestBody Long[] ids) {
    smsSkuFullReductionService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
