package com.qfedu.service;

import com.qfedu.entity.User;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/17  14:42
 * description:
 */

public interface UserService {
    //登录的方法
    public User login(String tel,String password);
    //注册方法
    public void register(String tel,String password,String email,String invitation);

}
