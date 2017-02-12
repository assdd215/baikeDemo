package com.controller;

import com.model.testPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.testService;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aria on 2017/2/10.
 */


@Controller
@RequestMapping(value = "/test")
@ResponseBody
public class testController {

    @Autowired
    testService service;

    @RequestMapping(value = "/add/{id}/{username}")
    public String addPojo(@PathVariable(value = "id")int id,
                          @PathVariable(value = "username")String username){
        testPojo pojo = new testPojo();
        pojo.setId(id);
        pojo.setUsername(username);
        service.add(pojo);
        return id+username;
    }

    @RequestMapping(value = "")
    public String test(){
        System.out.println("test ++++++++++++++++++++++++++++++++");
        List<testPojo> list = new ArrayList<testPojo>();
        list.add(new testPojo(13,"gagaf"));
        list.add(new testPojo(14,"ffafaf"));
        list.add(new testPojo(1,"55555"));
        service.insert(list);
        return "test";
    }
}
