package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Car;
import com.qfedu.entity.City;
import com.qfedu.service.CityService;
import com.qfedu.utils.DistrictUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * projectName: TestThreeProject
 * author: 崔
 * time: 2020/09/17  21:09
 * description:
 */
@Controller

public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping("/select.do")
    @ResponseBody
    public JsonResult query(String pid, HttpSession session){
        System.out.println("pid = " + pid);
            if(pid == null){
                pid="0";
            }
        int i = Integer.parseInt (pid);
        List<City> citys = cityService.findall(i);
        return new JsonResult(1,citys);
    }

    @RequestMapping("/showCar.do")
    @ResponseBody
    public Map<String,Object> showpage(Integer page,Integer limit){
        List<Car> cars = cityService.select(DistrictUtils.getQuiz2(), page, limit);
        long total = ((Page) cars).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",cars);
        return map;
    }


    @RequestMapping("/button.do")
    @ResponseBody
    public JsonResult getCity(Integer quiz1,Integer quiz2,Integer quiz3,Integer quiz4){
        if(quiz1==null || quiz2==null || quiz3==null || quiz4==null){
            return new JsonResult(0,"区域选择不正确");
        }
        DistrictUtils.setQuiz1(quiz1);
        DistrictUtils.setQuiz2(quiz2);
        DistrictUtils.setQuiz3(quiz3);
        DistrictUtils.setQuiz4(quiz4);
        return new JsonResult(1,"选择成功");
    }

    @RequestMapping("/selectName.do")
    @ResponseBody
    public JsonResult selectMsg(){
        City msg = cityService.getMsg(DistrictUtils.getQuiz2());
        City msg1 = cityService.getMsg(DistrictUtils.getQuiz4());
        String [] strings = {msg.getName(),msg1.getName()};
        return new JsonResult(1,strings);
    }
}
