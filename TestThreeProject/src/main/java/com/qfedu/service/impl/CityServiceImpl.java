package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CityDao;
import com.qfedu.dao.UserDao;
import com.qfedu.entity.Car;
import com.qfedu.entity.City;
import com.qfedu.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/17  21:12
 * description:
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    /**
     * 地址选择
     * @param pid
     * @return
     */
    @Override
    public List<City> findall(int pid) {
        List<City> cities = cityDao.findall(pid);

        return cities;
    }

    /**
     * 分页
     * @param cid
     * @param page
     * @param limit
     * @return
     */
    @Override
    public List<Car> select(int cid,Integer page,Integer limit) {
        PageHelper.startPage(page,limit);
        List<Car> select = cityDao.select(cid);
        if(select.size()==0){
            throw new RuntimeException("地区暂时没车");
        }
        return select;
    }


    /**
     * 通过地址选择地区的车辆
     * @param id
     * @return
     */
    @Override
    public City getMsg(int id) {
        City msg = cityDao.getMsg(id);
        return msg;
    }
}
