package com.ssm.dao;

import com.ssm.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
    List<Employee> get_List();
    List<Employee> get_LikeList(String content);
    void insert_Info(Employee employee);
    Employee get_Info(Integer id);
    void update_Info(Employee employee);
    void delete_Info(Integer id);
    Employee get_ByInfo(@Param("name") String name, @Param("password") String password);
}
