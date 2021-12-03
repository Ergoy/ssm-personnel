package com.ssm.test;

import com.ssm.dao.IUserDao;
import com.ssm.model.User;
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
    @Test

    public void test_1(){
        List<User> list=userDao.get_List();
        for (User user : list) {
            System.out.println(user.getPassword());
        }

    }
}
