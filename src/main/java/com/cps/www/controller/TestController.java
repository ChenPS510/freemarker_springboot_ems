package com.cps.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class TestController {
    @RequestMapping("test")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("test");
        modelAndView.addObject("name", "chenps");
        modelAndView.addObject("age", 10);
        return modelAndView;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        return "登录成功";
    }
}