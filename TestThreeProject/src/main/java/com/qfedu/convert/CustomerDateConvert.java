package com.qfedu.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * projectName: bankDoum
 * author: 崔
 * time: 2020/09/14  21:55
 * description: 自定义转换器类
 * 实现Converter<String, Date>接口
 * string表示带转换的类型
 * date表示转换完成的类型
 */

public class CustomerDateConvert implements Converter<String, Date> {
    SimpleDateFormat[] sdf = new SimpleDateFormat[]{
        new SimpleDateFormat("yyyy-MM-dd"),
        new SimpleDateFormat("yyyyMMdd"),
        new SimpleDateFormat("yyyy年MM月dd日")
    };
    @Override
    public Date convert(String s) {
        if(s != null || s.isEmpty()){
            return null;
        }
        for (SimpleDateFormat simpleDateFormat : sdf) {
            try {
                //把字符串转换为日期对象
                return simpleDateFormat.parse(s);
            } catch (ParseException e) {
//                e.printStackTrace();
                continue;
            }
        }
        return null;
    }
}
