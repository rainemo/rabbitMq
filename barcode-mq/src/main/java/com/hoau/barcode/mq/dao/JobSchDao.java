package com.hoau.barcode.mq.dao;

import com.hoau.barcode.mq.entity.JobSchEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobSchDao {

    List<JobSchEntity> query();
}
