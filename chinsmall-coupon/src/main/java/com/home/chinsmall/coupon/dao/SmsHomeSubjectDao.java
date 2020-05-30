package com.home.chinsmall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.home.chinsmall.coupon.entity.SmsHomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:15:51
 */
@Mapper
public interface SmsHomeSubjectDao extends BaseMapper<SmsHomeSubjectEntity> {

}
