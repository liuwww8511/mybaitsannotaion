package com.vivi.mybatis.beans;

public class Deparment {

    private  Integer id;

    private  String deptname;


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
