package com.lxj.ip.domain;

import com.lixj.core.AbstractEntity;

public class User extends AbstractEntity {
    private String name;
    private UserInfo userInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}