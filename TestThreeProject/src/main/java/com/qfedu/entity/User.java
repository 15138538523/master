package com.qfedu.entity;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/17  14:24
 * description:
 */

public class User {
    private int id;
    //电话
    private String tel;
    private String password;
    private String email;
    //验证码
    private String invitation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInvitation() {
        return invitation;
    }

    public void setInvitation(String invitation) {
        this.invitation = invitation;
    }
}
