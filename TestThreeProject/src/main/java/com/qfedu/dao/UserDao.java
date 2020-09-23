package com.qfedu.dao;

import com.qfedu.entity.User;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/17  14:23
 * description:
 */

public interface UserDao {
    //登录方法
    public User finaAll(String tel);
    //注册方法
    public void inserts(User user);
}
