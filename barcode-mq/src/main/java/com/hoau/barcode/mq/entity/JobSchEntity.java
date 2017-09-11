package com.hoau.barcode.mq.entity;

import java.io.Serializable;

public class JobSchEntity implements Serializable {

    private String id;

    private String triggerName;

    private String jobName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
