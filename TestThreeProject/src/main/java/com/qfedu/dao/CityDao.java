package com.qfedu.dao;

import com.qfedu.entity.Car;
import com.qfedu.entity.City;

import java.util.List;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/17  21:06
 * description:
 */

public interface CityDao {
    //查询城市
    public List<City> findall(int pid);
    //查询城市id
    public City getMsg(int id);
    //车辆选择
    public List<Car> select(int cid);

}
