package com.ssm.service.impl;

import com.ssm.dao.JobDao;
import com.ssm.model.Job;
import com.ssm.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("jobService")
public class JobServiceImpl implements JobService {
    @Resource
    private JobDao jobDao;

    @Override
    public List<Job> get_List() {
        return jobDao.get_List();
    }

    @Override
    public List<Job> get_LikeList(String content) {
        return jobDao.get_LikeList(content);
    }

    @Override
    public void insert_Info(Job job) {
        jobDao.insert_Info(job);
    }

    @Override
    public Job get_Info(Integer id) {
        return jobDao.get_Info(id);
    }

    @Override
    public void update_Info(Job job) {
        jobDao.update_Info(job);
    }

    @Override
    public void delete_Info(Integer id) {
        jobDao.delete_Info(id);
    }
}
