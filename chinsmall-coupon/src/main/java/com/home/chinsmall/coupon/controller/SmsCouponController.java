package com.home.chinsmall.coupon.controller;

import com.home.chinsmall.coupon.entity.SmsCouponEntity;
import com.home.chinsmall.coupon.service.SmsCouponService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.R;
import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 优惠券信息
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
@RestController
@RequestMapping("coupon/smscoupon")
public class SmsCouponController {

  @Autowired
  private SmsCouponService smsCouponService;

  /***
   * 会员所有的优惠券
   * @return
   */
  @GetMapping("/member/list")
  public R memberCoupons() {
    SmsCouponEntity smsCouponEntity = new SmsCouponEntity();
    smsCouponEntity.setCouponName("满100减20");
    return R.ok().put("coupons", Arrays.asList(smsCouponEntity));
  }

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("coupon:smscoupon:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = smsCouponService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("coupon:smscoupon:info")
  public R info(@PathVariable("id") Long id) {
    SmsCouponEntity smsCoupon = smsCouponService.getById(id);

    return R.ok().put("smsCoupon", smsCoupon);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("coupon:smscoupon:save")
  public R save(@RequestBody SmsCouponEntity smsCoupon) {
    smsCouponService.save(smsCoupon);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("coupon:smscoupon:update")
  public R update(@RequestBody SmsCouponEntity smsCoupon) {
    smsCouponService.updateById(smsCoupon);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("coupon:smscoupon:delete")
  public R delete(@RequestBody Long[] ids) {
    smsCouponService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
