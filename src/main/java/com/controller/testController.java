package com.controller;

import com.model.testPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.testService;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "test";
    }
}
