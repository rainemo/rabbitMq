package com.hoau.barcode.mq.service.impl;

import com.hoau.barcode.mq.dao.JobSchDao;
import com.hoau.barcode.mq.entity.JobSchEntity;
import com.hoau.barcode.mq.service.IJobSchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSchService implements IJobSchService {

    @Autowired
    private JobSchDao jobSchDao;
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    public List<JobSchEntity> query() {
        log.trace("trace=======>trace");
        log.debug("debug=======>debug");
        log.info("info=======>info");
        log.warn("warn=======>warn");
        log.error("error=======>error");
        return jobSchDao.query();
    }
}
