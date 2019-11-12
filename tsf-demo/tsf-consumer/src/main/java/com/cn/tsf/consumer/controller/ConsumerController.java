package com.cn.tsf.consumer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 葛鹏飞
 * @Date: 2019/11/12 16:06
 * @Version 1.0
 * 类信息:
 */
@RestController
public class ConsumerController {

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        System.out.println("输入的请求参数为 :" + string);
        return string;
    }

}
