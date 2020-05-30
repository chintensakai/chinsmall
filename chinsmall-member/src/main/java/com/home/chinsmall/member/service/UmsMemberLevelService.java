package com.home.chinsmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.member.entity.UmsMemberLevelEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 会员等级
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:19:47
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevelEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

