package com.hello.system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zili.wang@hand-china.com 2017/5/23 10:22
 * @version 1.0
 * @name DemoController
 * @description
 **/
@Controller
public class DemoController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("--------------000----------");
        return "login";
    }
}
