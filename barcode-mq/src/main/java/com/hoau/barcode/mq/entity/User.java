package com.hoau.barcode.mq.entity;

import java.io.Serializable;

public class User implements Serializable {
//    private static final long serialVersionUID = -4944176641073443141L;

    private String userName;

    private String userId;

    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", age=" + age +
                '}';
    }
}
