package com.ssm.service;

import com.ssm.model.Document;

import java.util.List;

public interface DocumentService {
    List<Document> get_List();
    List<Document> get_LikeList(String content);
    void insert_Info(Document dept);
    Document get_Info(Integer id);
    void update_Info(Document dept);
    void delete_Info(Integer id);
}
