package com.cps.www.dao;

import com.cps.www.entity.Emp;

import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> selectAllEmps();
}