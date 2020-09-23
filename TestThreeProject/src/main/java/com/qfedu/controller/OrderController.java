package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.*;
import com.qfedu.service.CityService;
import com.qfedu.service.OrderService;
import com.qfedu.utils.DistrictUtils;
import com.qfedu.utils.strUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/19  11:13
 * description:
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CityService cityService;
    @RequestMapping("/findCar.do")
    @ResponseBody
    public JsonResult findCar(int id){
        Car cars = orderService.findCars(id);

        return new JsonResult(1,cars);
    }
    @RequestMapping("/addCar.do")
    @ResponseBody
    public JsonResult queryOrder(Integer id, double oprice, HttpSession session){
        System.out.println(oprice);

        User user = (User) session.getAttribute(strUtils.LOGIN_USER);
        if(user == null){
            return new JsonResult(0,"未登录");
        }
        Integer quiz2 = DistrictUtils.getQuiz2();
        Integer quiz4 = DistrictUtils.getQuiz4();
        City msg = cityService.getMsg(quiz2);
        City msg1 = cityService.getMsg(quiz4);
        Order order = new Order();
        order.setCid(id);
        order.setOprice(oprice);
        order.setGetId(msg.getId());
        order.setBackid(msg1.getId());
        order.setUid(user.getId());
        order.setStatus("已预订");
        System.out.println("order = " + order);
        orderService.queryOrder(order);
        return new JsonResult(1,"预定成功");
    }
    @RequestMapping("/orderSelect.do")
    @ResponseBody
    public Map<String,Object> selectOrder(int page,int limit,HttpSession session){
        User user = (User) session.getAttribute(strUtils.LOGIN_USER);
        if(user == null){
            return null;
        }
        int id = user.getId();
        List<OrderTow> list = orderService.selectOrder(id, page, limit);
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

}
