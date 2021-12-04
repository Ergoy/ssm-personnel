package com.ssm.service.impl;

import com.ssm.dao.DeptDao;
import com.ssm.model.Dept;
import com.ssm.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    @Override
    public List<Dept> selectAllDept() {
        return deptDao.selectAllDept();
    }

    @Override
    public List<Dept> selectLikeAllDept(String content) {
        System.out.println(content);
        return deptDao.selectLikeAllDept(content);
    }

    @Override
    public void save(Dept dept) {
        deptDao.save(dept);
    }

    @Override
    public Dept get_Info(Integer id) {
        Dept dept = deptDao.get_Info(id);
        return dept;
    }

    @Override
    public void update_Info(Dept dept) {
        deptDao.update_Info(dept);
    }

    @Override
    public void delete_Info(Integer id) {
        deptDao.delete_Info(id);
    }
}
