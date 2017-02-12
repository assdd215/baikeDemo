package com.service;

import com.model.testPojo;

import java.util.List;

/**
 * Created by Aria on 2017/2/10.
 */
public interface testService {
    void add(testPojo pojo);

    void insert(List<testPojo> list);
}
