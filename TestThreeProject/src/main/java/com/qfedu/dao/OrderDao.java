package com.qfedu.dao;

import com.qfedu.entity.Car;
import com.qfedu.entity.Order;
import com.qfedu.entity.OrderTow;

import java.util.List;

public interface OrderDao {
    public Car  findCar(int id);
    public void queryOrders(Order order);
    public  List<OrderTow> selectOrder(int id);


}
