package com.home.chinsmall.member.controller;

import com.home.chinsmall.member.entity.UmsMemberLoginLogEntity;
import com.home.chinsmall.member.service.UmsMemberLoginLogService;
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
 * 会员登录记录
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:19:47
 */
@RestController
@RequestMapping("member/umsmemberloginlog")
public class UmsMemberLoginLogController {

  @Autowired
  private UmsMemberLoginLogService umsMemberLoginLogService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("member:umsmemberloginlog:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = umsMemberLoginLogService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("member:umsmemberloginlog:info")
  public R info(@PathVariable("id") Long id) {
    UmsMemberLoginLogEntity umsMemberLoginLog = umsMemberLoginLogService.getById(id);

    return R.ok().put("umsMemberLoginLog", umsMemberLoginLog);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("member:umsmemberloginlog:save")
  public R save(@RequestBody UmsMemberLoginLogEntity umsMemberLoginLog) {
    umsMemberLoginLogService.save(umsMemberLoginLog);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("member:umsmemberloginlog:update")
  public R update(@RequestBody UmsMemberLoginLogEntity umsMemberLoginLog) {
    umsMemberLoginLogService.updateById(umsMemberLoginLog);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("member:umsmemberloginlog:delete")
  public R delete(@RequestBody Long[] ids) {
    umsMemberLoginLogService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
