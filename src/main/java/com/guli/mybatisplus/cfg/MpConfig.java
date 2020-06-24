package com.guli.mybatisplus.cfg;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis-plus的配置类.
 */
@Configuration
@MapperScan("com.guli.mybatisplus.mapper")
@EnableTransactionManagement
public class MpConfig {

  // 注册乐观锁到IOC中
  @Bean
  public OptimisticLockerInterceptor optimisticLockerInterceptor() {
    return new OptimisticLockerInterceptor();
  }




}
