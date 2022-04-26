package com.vivi.mybatis.dao;

import com.vivi.mybatis.beans.Employee;

import java.util.List;

public interface EmployeeMapperDynamicSQL {

    public List<Employee> getEmpsByConditionIfWhere(Employee Condition);

    public void  updateEmpByConditionSet(Employee Condition);

    public void  updateEmpByConditionSet1(Employee Condition);


}
