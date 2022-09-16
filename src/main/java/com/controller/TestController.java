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
        return "success";
    }
}
