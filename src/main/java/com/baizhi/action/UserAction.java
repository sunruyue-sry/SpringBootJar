package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserAction {

    @RequestMapping("/hello")
    public String hello() throws Exception {
        System.out.println("hello jsp");
        return "index";
    }

}
