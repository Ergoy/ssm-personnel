package com.ssm.dao;

import com.ssm.model.Dept;

import java.util.List;

public interface DeptDao {
    List<Dept> selectAllDept();
    List<Dept> selectLikeAllDept(String content);
    void save(Dept dept);
    Dept get_Info(Integer id);
    void update_Info(Dept dept);
    void delete_Info(Integer id);

}
