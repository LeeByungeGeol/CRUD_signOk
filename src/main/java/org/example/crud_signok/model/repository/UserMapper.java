package org.example.crud_signok.model.repository;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectUser(User user);
}