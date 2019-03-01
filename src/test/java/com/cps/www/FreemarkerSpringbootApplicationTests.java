package com.cps.www;

import com.cps.www.entity.Emp;
import com.cps.www.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FreemarkerSpringbootApplicationTests {
    @Autowired
    private EmpService empService;

    @Test
    public void contextLoads() {
        List<Emp> emps = empService.selectAllEmps();

        System.out.println("hahahahhaha1111111111111111111");

        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

}
