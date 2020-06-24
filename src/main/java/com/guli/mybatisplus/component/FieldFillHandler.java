package com.guli.mybatisplus.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 元对象数据填充处理器.
 */
@Component
public class FieldFillHandler implements MetaObjectHandler {

  @Override
  public void insertFill(MetaObject metaObject) {
    this.setFieldValByName("createTime", LocalDateTime.now(), metaObject);
    this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
    this.setFieldValByName("version", 1L, metaObject);
  }

  @Override
  public void updateFill(MetaObject metaObject) {
    this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
  }
}
