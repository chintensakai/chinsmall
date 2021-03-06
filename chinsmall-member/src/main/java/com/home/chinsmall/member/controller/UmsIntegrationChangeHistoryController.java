package com.home.chinsmall.member.controller;

import com.home.chinsmall.member.entity.UmsIntegrationChangeHistoryEntity;
import com.home.chinsmall.member.service.UmsIntegrationChangeHistoryService;
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
 * 积分变化历史记录
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:19:47
 */
@RestController
@RequestMapping("member/umsintegrationchangehistory")
public class UmsIntegrationChangeHistoryController {

  @Autowired
  private UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("member:umsintegrationchangehistory:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = umsIntegrationChangeHistoryService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("member:umsintegrationchangehistory:info")
  public R info(@PathVariable("id") Long id) {
    UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory = umsIntegrationChangeHistoryService
        .getById(id);

    return R.ok().put("umsIntegrationChangeHistory", umsIntegrationChangeHistory);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("member:umsintegrationchangehistory:save")
  public R save(@RequestBody UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory) {
    umsIntegrationChangeHistoryService.save(umsIntegrationChangeHistory);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("member:umsintegrationchangehistory:update")
  public R update(@RequestBody UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory) {
    umsIntegrationChangeHistoryService.updateById(umsIntegrationChangeHistory);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("member:umsintegrationchangehistory:delete")
  public R delete(@RequestBody Long[] ids) {
    umsIntegrationChangeHistoryService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
