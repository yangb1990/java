package com.online.mall.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangb on 2019/3/10.
 */
@RestController
public class testController {

    @GetMapping("/getTest")
    public String test(){
        System.out.println("哈哈哈哈");
        return "啦啦啦";
    }
}
