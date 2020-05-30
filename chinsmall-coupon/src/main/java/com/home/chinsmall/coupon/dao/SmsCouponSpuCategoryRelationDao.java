package com.home.chinsmall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.home.chinsmall.coupon.entity.SmsCouponSpuCategoryRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券分类关联
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
@Mapper
public interface SmsCouponSpuCategoryRelationDao extends
    BaseMapper<SmsCouponSpuCategoryRelationEntity> {

}
