package com.home.chinsmall.member.feign;

import com.home.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("chinsmall-coupon")
public interface CouponFeignService {

  @GetMapping("/coupon/smscoupon/member/list")
  public R memberCoupons();
}
