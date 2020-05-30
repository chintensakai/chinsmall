package com.home.chinsmall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.home.chinsmall.member.entity.UmsMemberLoginLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:19:47
 */
@Mapper
public interface UmsMemberLoginLogDao extends BaseMapper<UmsMemberLoginLogEntity> {

}
