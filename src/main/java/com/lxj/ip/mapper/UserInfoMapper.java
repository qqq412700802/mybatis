package com.lxj.ip.mapper;

import com.lxj.ip.domain.UserInfo;
import java.util.List;

public interface UserInfoMapper {
    int insert(UserInfo record);

    List<UserInfo> selectAll();
}