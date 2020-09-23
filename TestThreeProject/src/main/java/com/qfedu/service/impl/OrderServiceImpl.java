package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.OrderDao;
import com.qfedu.entity.Car;
import com.qfedu.entity.Order;
import com.qfedu.entity.OrderTow;
import com.qfedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/19  11:09
 * description:
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public Car findCars(int id) {
        Car cars = orderDao.findCar(id);
        return cars;
    }

    @Override
    public void queryOrder(Order order) {
        if (order == null){
            throw new RuntimeException("订单有误");
        }
        orderDao.queryOrders(order);
    }

    @Override
    public List<OrderTow> selectOrder(int id,int page,int limit) {
    //分页
        PageHelper.startPage(page,limit);
        List<OrderTow> orderTows = orderDao.selectOrder(id);

        return orderTows;
    }
}
