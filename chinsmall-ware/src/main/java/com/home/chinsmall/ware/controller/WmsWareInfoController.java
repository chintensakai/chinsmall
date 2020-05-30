package com.home.chinsmall.ware.controller;

import com.home.chinsmall.ware.entity.WmsWareInfoEntity;
import com.home.chinsmall.ware.service.WmsWareInfoService;
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
 * 仓库信息
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:22:59
 */
@RestController
@RequestMapping("ware/wmswareinfo")
public class WmsWareInfoController {

  @Autowired
  private WmsWareInfoService wmsWareInfoService;

  /**
   * 列表
   */
  @RequestMapping("/list")
  // @RequiresPermissions("ware:wmswareinfo:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = wmsWareInfoService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("ware:wmswareinfo:info")
  public R info(@PathVariable("id") Long id) {
    WmsWareInfoEntity wmsWareInfo = wmsWareInfoService.getById(id);

    return R.ok().put("wmsWareInfo", wmsWareInfo);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  // @RequiresPermissions("ware:wmswareinfo:save")
  public R save(@RequestBody WmsWareInfoEntity wmsWareInfo) {
    wmsWareInfoService.save(wmsWareInfo);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  // @RequiresPermissions("ware:wmswareinfo:update")
  public R update(@RequestBody WmsWareInfoEntity wmsWareInfo) {
    wmsWareInfoService.updateById(wmsWareInfo);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  // @RequiresPermissions("ware:wmswareinfo:delete")
  public R delete(@RequestBody Long[] ids) {
    wmsWareInfoService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
