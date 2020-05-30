package com.home.chinsmall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.home.chinsmall.coupon.entity.SmsSeckillSessionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:50
 */
@Mapper
public interface SmsSeckillSessionDao extends BaseMapper<SmsSeckillSessionEntity> {

}
