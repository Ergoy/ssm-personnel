package com.ssm.service;

import com.ssm.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeService {
    List<Employee> get_List();
    List<Employee> get_LikeList(String content);
    void insert_Info(Employee employee);
    Employee get_Info(Integer id);
    void update_Info(Employee employee);
    void delete_Info(Integer id);
    Employee get_ByInfo(String name,String password);
}
