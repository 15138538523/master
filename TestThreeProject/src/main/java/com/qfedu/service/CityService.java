package com.qfedu.service;

import com.qfedu.entity.Car;
import com.qfedu.entity.City;

import java.util.List;

public interface CityService {

    public List<City> findall(int pid);
    public List<Car> select(int cid,Integer page,Integer limit);
    public City getMsg(int id);

}
