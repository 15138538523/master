package com.qfedu.controller;


import com.qfedu.common.JsonResult;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import com.qfedu.utils.strUtils;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/17  14:41
 * description:
 */
@Controller
@Validated
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login.do")
    @ResponseBody
    public JsonResult login(HttpSession session,  String tel,  String password){
        User user = userService.login(tel, password);
        session.setAttribute(strUtils.LOGIN_USER,user);
        JsonResult jsonResult = new JsonResult(1, user);
        return jsonResult;
    }

    @RequestMapping("/register.do")
    @ResponseBody
    public JsonResult register(String tel,String password,String email,String invitation){
        userService.register(tel,password,email,invitation);
        User user = userService.login(tel, password);
        return new JsonResult(1,user);
    }
    @RequestMapping("/query.do")
    @ResponseBody
    public JsonResult query(HttpSession session){
        User user = (User) session.getAttribute(strUtils.LOGIN_USER);
        if(user == null){
            return new JsonResult(0,"未登录");
        }else {
            return  new JsonResult(1,user);
        }
    }
    @RequestMapping("/loginStusta.do")
    @ResponseBody
    public JsonResult login(HttpSession session){
        User user = (User) session.getAttribute(strUtils.LOGIN_USER);
        return new JsonResult(1,user.getTel());
    }





}
