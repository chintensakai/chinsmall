package com.home.chinsmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.home.chinsmall.product.entity.CommentReplayEntity;
import com.home.common.utils.PageUtils;
import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:03
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

