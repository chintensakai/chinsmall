package com.home.chinsmall.coupon.controller;

import com.home.chinsmall.coupon.entity.SmsSkuLadderEntity;
import com.home.chinsmall.coupon.service.SmsSkuLadderService;
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
 * 商品阶梯价格
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
@RestController
@RequestMapping("coupon/smsskuladder")
public class SmsSkuLadderController {

  @Autowired
  private SmsSkuLadderService smsSkuLadderService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("coupon:smsskuladder:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = smsSkuLadderService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("coupon:smsskuladder:info")
  public R info(@PathVariable("id") Long id) {
    SmsSkuLadderEntity smsSkuLadder = smsSkuLadderService.getById(id);

    return R.ok().put("smsSkuLadder", smsSkuLadder);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("coupon:smsskuladder:save")
  public R save(@RequestBody SmsSkuLadderEntity smsSkuLadder) {
    smsSkuLadderService.save(smsSkuLadder);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("coupon:smsskuladder:update")
  public R update(@RequestBody SmsSkuLadderEntity smsSkuLadder) {
    smsSkuLadderService.updateById(smsSkuLadder);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("coupon:smsskuladder:delete")
  public R delete(@RequestBody Long[] ids) {
    smsSkuLadderService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
