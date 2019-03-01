package com.cps.www.controller;

import com.cps.www.entity.Emp;
import com.cps.www.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("selectAllEmps")
    public ModelAndView selectAllEmps(ModelAndView modelAndView) {
        List<Emp> emps = empService.selectAllEmps();

        modelAndView.setViewName("empManage");
        modelAndView.addObject("emps", emps);

        return modelAndView;
    }
    /*@RequestMapping("selectAllEmps")
    public ModelAndView selectAllEmps(ModelAndView modelAndView) {
        List<Emp> emps = empService.selectAllEmps();

        modelAndView.setViewName("empManage");
        for (Emp emp : emps) {
            modelAndView.addObject("id", emp.getId());
            modelAndView.addObject("name",emp.getName());
            modelAndView.addObject("age",emp.getAge());
            modelAndView.addObject("birthday",emp.getBirthday());
            modelAndView.addObject("salary",emp.getSalary());
            modelAndView.addObject("sex",emp.getSex());
            modelAndView.addObject("score",emp.getScore());
        }
        return modelAndView;
    }*/

}
