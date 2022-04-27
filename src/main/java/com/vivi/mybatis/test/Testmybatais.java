package com.vivi.mybatis.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.vivi.mybatis.beans.Deparment;
import com.vivi.mybatis.beans.Employee;
import com.vivi.mybatis.dao.DepartmentMapper;
import com.vivi.mybatis.dao.EmployeeMapper;

import com.vivi.mybatis.dao.EmployeeMapperDynamicSQL;
import org.apache.ibatis.io.Resources;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Testmybatais {


    @Test
    public void getone2() throws IOException {

        String resoruce = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resoruce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            //代理类invoke方法
            DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
//            Employee employee = new Employee();
//            employee.setId(21);
//            employee.setLastName("vivi2");
//            employee.setGender(1);

            Deparment deparment = mapper.getone2(1);
            System.out.println(deparment);
            System.out.println(deparment.getEmps());
//            System.out.println(selectrelation.getDep().getDeptname());
//            Employee employee = new Employee(21,"afs",1,"vivi@qq.com");


        }
        finally {
            sqlSession.commit();
        }
    }


    @Test
    public void ass() throws IOException {

        String resoruce = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resoruce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            //代理类invoke方法
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            System.out.println(mapper);
            Employee selectrelation = mapper.selectrelation(21);
            System.out.println(selectrelation.getLastName());
//            System.out.println(selectrelation.getDep().getDeptname());
//            Employee employee = new Employee(21,"afs",1,"vivi@qq.com");


        }
        finally {
            sqlSession.commit();
        }
    }








}
