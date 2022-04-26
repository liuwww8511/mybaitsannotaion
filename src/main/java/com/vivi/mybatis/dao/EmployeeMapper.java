package com.vivi.mybatis.dao;

import com.vivi.mybatis.beans.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

//    public Employee getEmployeeid(Integer id);
//
//    //新增
//    public Integer addEmployee(Employee employee);
//
//    //更新
//
//    public Integer updateEmployee(Employee employee);
//    //删除
//        //1 单个参数，在mpper.XMl文件中，参数名字可以人任意值
//        //2 多个参数，①mapper.xml文件中，接受参数可以是0、1、2、3、4、5自然排序，缺点：如果传输参数多，流水号没意义，不方便赋值
//        //          ②mapper.xml文件中，接受参数可以是param1、param2、param3、param4，param+流水号 缺点：如果传输参数多，流水号没意义，不方便赋值
//        //          ③mapper.xml文件中，可以在DAO的mapper.java文件中用@Param()取别名，项目上使用比较多
//        //3 pojo    DAO的mapper.java传入的参数是javabean对象，在接受文件Mapper.XML文件中，参数就是javabean的属性值
//        //4 map封装  我们也可以封装多个参数为map，直接传递//取值: #{使用封装Map时自己指定的key}
//
//    //测试多个参数
//    public Employee selectmanyfield(String lastname, Integer gender);
//
//    //测试map对象封装的KEY
//
//    public Employee selectmap(Map<String,Object> map);
//
//
//    //传输pojo
//    public Employee selectEmployee(Employee employee);
//
//
//    //传输属性名
//   public Employee selectfield(@Param("lastname") String lastname,Integer gender,@Param("tablename") String tablename);
//
//   public Employee selecttwofield(String lastname,Integer gender);
//
//   public Employee selectEmp(Employee employee);
//
//   public Employee slelectparam(@Param("lastname") String lastanme, Integer gender);
//
//
//   //返回LIst集合
//    List<Employee> getList(String name);
//
//    //返回单行Map数据
//    public Map<String,Object> getEmployeeByIdReturnMap(Integer id );
//
//
//    //获取多行Map数据
//    @MapKey("id")
//    public Map<Integer,Employee> getmanymap();
//
//
//    //自定义映射
//    public Employee selectMapping(Integer id);
//
//
//    public Employee one(@Param("name")String name);

    // //分步查询

    public Employee selectrelation(Integer id);


   //关联查询
   public Employee selectrelation1(Integer id);
//    //分步查询
//    public  Employee selectassciation(Integer id);

}
