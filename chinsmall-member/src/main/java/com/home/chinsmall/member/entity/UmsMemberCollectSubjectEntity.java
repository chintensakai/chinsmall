package com.home.chinsmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 会员收藏的专题活动
 *
 * @author chins
 * @email chins@gmail.com
 * @date 2020-05-29 23:19:47
 */
@Data
@TableName("ums_member_collect_subject")
public class UmsMemberCollectSubjectEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * subject_id
   */
  private Long subjectId;
  /**
   * subject_name
   */
  private String subjectName;
  /**
   * subject_img
   */
  private String subjectImg;
  /**
   * 活动url
   */
  private String subjectUrll;

}
