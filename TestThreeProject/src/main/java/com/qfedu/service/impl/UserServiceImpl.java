package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/17  14:46
 * description:
 */
@Service
public class UserServiceImpl implements UserService {
        @Autowired
        private UserDao userDao;
    @Override
    public User login(String tel,String password) {
        User user = userDao.finaAll(tel);
        if(user == null){
            throw  new RuntimeException("账号错误");
        }
        if(!user.getPassword().equals(password)){
            throw new RuntimeException("密码错误");
        }
        return user;
    }

    @Override
    public void register(String tel, String password, String email, String invitation) {
        User user = new User();
        user.setTel(tel);
        user.setPassword(password);
        user.setEmail(email);
        user.setInvitation(invitation);
        userDao.inserts(user);
    }


}
