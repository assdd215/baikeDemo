package com.service.impl;

import mapper.testMapper;
import com.model.testPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.testService;

/**
 * Created by Aria on 2017/2/10.
 */

@Service
public class testServiceImpl implements testService {

    @Autowired
    testMapper TestMapper;

    @Override
    public void add(testPojo pojo) {
        TestMapper.add(pojo);
    }
}
