package com.home.chinsmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class ChinsMallCorsConfiguration {

  @Bean
  public CorsWebFilter corsWebFilter() {

    UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
    CorsConfiguration corsConfiguration = new CorsConfiguration();
    corsConfiguration.addAllowedHeader("*");
    corsConfiguration.addAllowedMethod("*");
    corsConfiguration.addAllowedOrigin("*");
    corsConfiguration.setAllowCredentials(true);
    configurationSource.registerCorsConfiguration("/**", corsConfiguration);
    return new CorsWebFilter(configurationSource);
  }
}
