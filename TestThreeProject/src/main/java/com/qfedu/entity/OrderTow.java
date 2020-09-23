package com.qfedu.entity;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/20  13:15
 * description:
 */

public class OrderTow {
        private int id;
        private String name;
        private String getCar;
        private  String backCar;
        private String status;

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

    public String getGetCar() {
        return getCar;
    }

    public void setGetCar(String getCar) {
        this.getCar = getCar;
    }

    public String getBackCar() {
        return backCar;
    }

    public void setBackCar(String backCar) {
        this.backCar = backCar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderTow{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", getCar='" + getCar + '\'' +
                ", backCar='" + backCar + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
