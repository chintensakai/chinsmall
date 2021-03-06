package com.home.chinsmall.order.controller;

import com.home.chinsmall.order.entity.OmsOrderEntity;
import com.home.chinsmall.order.service.OmsOrderService;
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
 * 订单
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:09:15
 */
@RestController
@RequestMapping("order/omsorder")
public class OmsOrderController {

  @Autowired
  private OmsOrderService omsOrderService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("order:omsorder:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = omsOrderService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("order:omsorder:info")
  public R info(@PathVariable("id") Long id) {
    OmsOrderEntity omsOrder = omsOrderService.getById(id);

    return R.ok().put("omsOrder", omsOrder);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("order:omsorder:save")
  public R save(@RequestBody OmsOrderEntity omsOrder) {
    omsOrderService.save(omsOrder);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("order:omsorder:update")
  public R update(@RequestBody OmsOrderEntity omsOrder) {
    omsOrderService.updateById(omsOrder);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("order:omsorder:delete")
  public R delete(@RequestBody Long[] ids) {
    omsOrderService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
