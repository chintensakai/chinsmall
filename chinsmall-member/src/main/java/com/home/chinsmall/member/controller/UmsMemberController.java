package com.home.chinsmall.member.controller;

import com.home.chinsmall.member.entity.UmsMemberEntity;
import com.home.chinsmall.member.feign.CouponFeignService;
import com.home.chinsmall.member.service.UmsMemberService;
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
 * 会员
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:19:47
 */
@RestController
@RequestMapping("member/umsmember")
public class UmsMemberController {

  @Autowired
  private UmsMemberService umsMemberService;

  @Autowired
  private CouponFeignService couponFeignService;

  @GetMapping("/coupons")
  public R test() {
    UmsMemberEntity umsMemberEntity = new UmsMemberEntity();
    umsMemberEntity.setNickname("张三");

    R r = couponFeignService.memberCoupons();
    return R.ok().put("member", umsMemberEntity).put("coupons", r.get("coupons"));
  }

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("member:umsmember:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = umsMemberService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("member:umsmember:info")
  public R info(@PathVariable("id") Long id) {
    UmsMemberEntity umsMember = umsMemberService.getById(id);

    return R.ok().put("umsMember", umsMember);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("member:umsmember:save")
  public R save(@RequestBody UmsMemberEntity umsMember) {
    umsMemberService.save(umsMember);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("member:umsmember:update")
  public R update(@RequestBody UmsMemberEntity umsMember) {
    umsMemberService.updateById(umsMember);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("member:umsmember:delete")
  public R delete(@RequestBody Long[] ids) {
    umsMemberService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
