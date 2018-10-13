package com.secone.octsct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String showHello() {
        return "welcome to my boot";
    }
}
