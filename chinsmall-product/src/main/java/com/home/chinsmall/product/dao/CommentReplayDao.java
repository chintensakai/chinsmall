package com.home.chinsmall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.home.chinsmall.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 19:03:03
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
