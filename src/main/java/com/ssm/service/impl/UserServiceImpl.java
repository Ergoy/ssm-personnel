package com.ssm.service.impl;


import com.ssm.dao.IUserDao;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }

    @Override
    public List<User> get_List() {
        return userDao.get_List();
    }

    @Override
    public List<User> get_LikeList(String content) {
        return userDao.get_LikeList(content);
    }

    @Override
    public User get_login(String loginname, String password) {
        User user=userDao.get_login(loginname,password);
        return user;
    }

    @Override
    public void insert_Info(User user) {
        userDao.insert_Info(user);
    }

    @Override
    public User get_Info(Integer id) {
        return userDao.get_Info(id);
    }

    @Override
    public void update_Info(User user) {
        userDao.update_Info(user);
    }

    @Override
    public void delete_Info(Integer id) {
        userDao.delete_Info(id);
    }
}
