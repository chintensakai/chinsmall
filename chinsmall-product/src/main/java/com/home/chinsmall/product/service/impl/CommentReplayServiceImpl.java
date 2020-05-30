package com.home.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.home.chinsmall.product.dao.CommentReplayDao;
import com.home.chinsmall.product.entity.CommentReplayEntity;
import com.home.chinsmall.product.service.CommentReplayService;
import com.home.common.utils.PageUtils;
import com.home.common.utils.Query;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends
    ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CommentReplayEntity> page = this.page(
        new Query<CommentReplayEntity>().getPage(params),
        new QueryWrapper<CommentReplayEntity>()
    );

    return new PageUtils(page);
  }

}