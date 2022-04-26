package com.vivi.mybatis.beans;

import sun.dc.pr.PRError;

public class Employee {

    private  Integer id;

    private  String lastName;

    private  Integer gender;

    private  String email;

    private Deparment dep;



    public Employee() {
    }

    public Employee(Integer id, String lastName, Integer gender, String email, Deparment dep) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dep = dep;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Deparment getDep() {
        return dep;
    }

    public void setDep(Deparment dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", dep=" + dep +
                '}';
    }
}
