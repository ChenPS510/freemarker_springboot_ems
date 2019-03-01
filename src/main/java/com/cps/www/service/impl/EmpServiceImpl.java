package com.cps.www.service.impl;

import com.cps.www.dao.EmpMapper;
import com.cps.www.entity.Emp;
import com.cps.www.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> selectAllEmps() {
        return empMapper.selectAllEmps();
    }
}
