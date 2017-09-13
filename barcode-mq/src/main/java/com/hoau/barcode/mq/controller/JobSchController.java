package com.hoau.barcode.mq.controller;


import com.hoau.barcode.mq.entity.JobSchEntity;
import com.hoau.barcode.mq.service.IJobSchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobSchController {

    @Autowired
    private IJobSchService jobSchService;

    @RequestMapping("/")
    public String sayHello(){
        return "hello!";
    }

    @RequestMapping(value ="/query", method = RequestMethod.GET)
    public List<JobSchEntity> query(){
        return jobSchService.query();
    }

}
