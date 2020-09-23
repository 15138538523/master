package com.qfedu.entity;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/20  12:35
 * description:
 */

public class Order {
    private int id;
    private int cid;
    private int uid;
    private int getid;
    private int backid;
    private  double oprice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGetId() {
        return getid;
    }

    public void setGetId(int getId) {
        this.getid = getId;
    }

    public int getBackid() {
        return backid;
    }

    public void setBackid(int backid) {
        this.backid = backid;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

}
