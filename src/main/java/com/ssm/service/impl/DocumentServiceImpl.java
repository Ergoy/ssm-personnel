package com.ssm.service.impl;

import com.ssm.dao.DeptDao;
import com.ssm.dao.DocumentDao;
import com.ssm.model.Document;
import com.ssm.service.DocumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("documentService")
public class DocumentServiceImpl implements DocumentService {
    @Resource
    private DocumentDao documentDao;

    @Override
    public List<Document> get_List() {
        return documentDao.get_List();
    }

    @Override
    public List<Document> get_LikeList(String content) {
        return documentDao.get_LikeList(content);
    }

    @Override
    public void insert_Info(Document dept) {
        documentDao.insert_Info(dept);
    }

    @Override
    public Document get_Info(Integer id) {
        return documentDao.get_Info(id);
    }

    @Override
    public void update_Info(Document dept) {
        documentDao.update_Info(dept);
    }

    @Override
    public void delete_Info(Integer id) {
        documentDao.delete_Info(id);
    }
}
