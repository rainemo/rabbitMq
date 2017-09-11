package com.hoau.barcode.mq.service.impl;

import com.hoau.barcode.mq.dao.JobSchDao;
import com.hoau.barcode.mq.entity.JobSchEntity;
import com.hoau.barcode.mq.service.IJobSchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSchService implements IJobSchService {

    @Autowired
    private JobSchDao jobSchDao;

    public List<JobSchEntity> query() {
        return jobSchDao.query();
    }
}
