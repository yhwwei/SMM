package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yhw
 * @version 1.0
 **/
@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String testHello(){
        System.out.println("yest");
        System.out.println("hot fix");
        System.out.println("test push by IDEA");
        System.out.println("test push by github");
        return "success";
    }
}
