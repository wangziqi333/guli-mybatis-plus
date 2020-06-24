package com.guli.mybatisplus;

import com.guli.mybatisplus.entity.User;
import com.guli.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

  @Autowired
  UserMapper userMapper;

  @Test
  void test1() {
    User user = new User();
    user.setEmail("40@qq.com");
    user.setName("我们的纪念");
    user.setAge(100);
    userMapper.insert(user);
  }

  public static void main(String[] args) throws UnsupportedEncodingException {

  }



}
