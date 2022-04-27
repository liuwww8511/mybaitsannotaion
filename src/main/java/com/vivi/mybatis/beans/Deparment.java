package com.vivi.mybatis.beans;

import java.util.List;

public class Deparment {

    private  Integer id;

    private  String deptname;


    private List<Employee> emps;

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public Deparment() {
    }

    public Deparment(Integer id, String deptname) {
        this.id = id;
        this.deptname = deptname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "Deparment{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                '}';
    }
}

