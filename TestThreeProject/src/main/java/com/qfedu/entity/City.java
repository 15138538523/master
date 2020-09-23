package com.qfedu.entity;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/17  21:03
 * description: 地区实体类
 */

public class City {
    private int id;
    private String name;
    private int pid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

}
