package com.ssm.test;

import com.ssm.dao.*;
import com.ssm.model.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext*.xml"})
public class UserTest {
    @Autowired
    private IUserDao userDao;
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private DocumentDao documentDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private JobDao jobDao;
    @Autowired
    private NoticeDao noticeDao;
    @Test

    public void test_1(){
//        List<User> list=userDao.get_List();
//        for (User user : list) {
//            System.out.println(user.getPassword());
//        }
//        User user=new User();
//        user.setUsername("xxxx");
//        userDao.insert_Info(user);
        List<User> list=userDao.get_LikeList("a");
        for (User user : list) {
            System.out.println(user.getUsername());
        }
    }
    @Test
    public void testdp(){
//        List<Dept> list=deptDao.selectAllDept();
//        for (Dept dp : list) {
//            System.out.println(dp.getName());
//        }
        Dept dp=new Dept();
        dp.setName("chjk");
        deptDao.save(dp);
    }
    @Test
    public void testdc(){
        List<Document> list=documentDao.get_List();
        for (Document docu : list) {
            System.out.println(docu.getRemark());
        }
    }
    @Test
    public void testep(){
        List<Employee> list=employeeDao.get_List();
        for (Employee ep : list) {
            System.out.println(ep.getRemark());
        }
    }
    @Test
    public void testjob(){
        List<Job> list=jobDao.get_List();
        for (Job job : list) {
            System.out.println(job.getRemark());
        }
    }
    @Test
    public void testnot(){
        List<Notice> list=noticeDao.get_List();
        for (Notice no : list) {
            System.out.println(no.getContent());
        }
    }
}
