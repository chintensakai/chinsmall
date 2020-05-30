package com.home.chinsmall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.home.chinsmall.order.entity.OmsOrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:09:15
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {

}
