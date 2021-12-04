package com.ssm.dao;

import com.ssm.model.Job;

import java.util.List;

public interface JobDao {
    List<Job> get_List();
    List<Job> get_LikeList(String content);
    void insert_Info(Job job);
    Job get_Info(Integer id);
    void update_Info(Job job);
    void delete_Info(Integer id);
}
