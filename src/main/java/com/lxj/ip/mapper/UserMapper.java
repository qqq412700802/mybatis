package com.lxj.ip.mapper;

import com.lxj.ip.domain.User;
import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();

    User getById(Long id);
}