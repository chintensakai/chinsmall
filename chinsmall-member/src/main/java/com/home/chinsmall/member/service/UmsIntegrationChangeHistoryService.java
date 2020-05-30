package com.home.chinsmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.member.entity.UmsIntegrationChangeHistoryEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:19:47
 */
public interface UmsIntegrationChangeHistoryService extends
    IService<UmsIntegrationChangeHistoryEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

