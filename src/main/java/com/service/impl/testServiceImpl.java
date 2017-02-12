package com.service.impl;

import mapper.testMapper;
import com.model.testPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.testService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Transactional
    @Override
    public void insert(List<testPojo> list){
        for (int i=0;i<list.size();i++){
            if (i<2){
                TestMapper.add(list.get(i));
                System.out.println("inset "+i);
            }else {
                throw new RuntimeException();
            }
        }
    }
}
