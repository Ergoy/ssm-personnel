package com.ssm.service.impl;

import com.ssm.dao.DeptDao;
import com.ssm.dao.EmployeeDao;
import com.ssm.dao.JobDao;
import com.ssm.model.Dept;
import com.ssm.model.Employee;
import com.ssm.model.Job;
import com.ssm.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;
    @Resource
    private DeptDao deptDao;
    @Resource
    private JobDao jobDao;
    @Override
    public List<Employee> get_List() {
        List<Employee> list=employeeDao.get_List();
        int size= list.size();
        List<Employee> list1=new ArrayList<>();
        for(int i=0;i<size;i++){
            Employee employee=list.get(i);
            Dept dept=deptDao.get_Info(employee.getDept_id());
            employee.setDept(dept);
            Job job=jobDao.get_Info(employee.getJob_id());
            employee.setJob(job);
            list1.add(employee);
        }
        return list1;
    }

    @Override
    public List<Employee> get_LikeList(String content) {
        List<Employee> list=employeeDao.get_LikeList(content);
        int size= list.size();
        List<Employee> list1=new ArrayList<>();
        for(int i=0;i<size;i++){
            Employee employee=list.get(i);
            Dept dept=deptDao.get_Info(employee.getDept_id());
            employee.setDept(dept);
            Job job=jobDao.get_Info(employee.getJob_id());
            employee.setJob(job);
            list1.add(employee);
        }
        return list1;
    }

    @Override
    public void insert_Info(Employee employee) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        employee.setCreate_date(sdf.format(date));
        System.out.println(employee.getPassword()+"0000000000000000");
        employeeDao.insert_Info(employee);
    }

    @Override
    public Employee get_Info(Integer id) {
        Employee employee=employeeDao.get_Info(id);
        Dept dept=deptDao.get_Info(employee.getDept_id());
        Job job=jobDao.get_Info(employee.getJob_id());
        employee.setJob(job);
        employee.setDept(dept);
        return employee;
    }

    @Override
    public void update_Info(Employee employee) {
        employeeDao.update_Info(employee);
    }

    @Override
    public void delete_Info(Integer id) {
        System.out.print(id);
        employeeDao.delete_Info(id);
    }

    @Override
    public Employee get_ByInfo(String name, String password) {
        return employeeDao.get_ByInfo(name,password);
    }
}
