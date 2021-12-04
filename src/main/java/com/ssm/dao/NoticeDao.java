package com.ssm.dao;

import com.ssm.model.Notice;

import java.util.List;

public interface NoticeDao {
    List<Notice> get_List();
    List<Notice> get_LikeList(String content);
    void insert_Info(Notice employee);
    Notice get_Info(Integer id);
    void update_Info(Notice employee);
    void delete_Info(Integer id);
}
