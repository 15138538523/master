package com.qfedu.service;

import com.qfedu.entity.Car;
import com.qfedu.entity.Order;
import com.qfedu.entity.OrderTow;

import java.util.List;

public interface OrderService {
    public Car findCars(int id);
    public void queryOrder(Order order);
    public List<OrderTow> selectOrder(int id, int page,int limit);

}
