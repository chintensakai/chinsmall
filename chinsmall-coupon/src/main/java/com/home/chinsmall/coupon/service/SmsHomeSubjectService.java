package com.home.chinsmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.coupon.entity.SmsHomeSubjectEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
public interface SmsHomeSubjectService extends IService<SmsHomeSubjectEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

