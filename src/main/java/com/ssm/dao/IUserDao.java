package com.ssm.dao;

import com.ssm.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {
    User selectUser(long id);
    List<User> get_List();
    List<User> get_LikeList(String content);
    User get_login(@Param("loginname") String loginname,@Param("password") String password);
    void insert_Info(User user);
    User get_Info(Integer id);
    void update_Info(User user);
    void delete_Info(Integer id);

}
