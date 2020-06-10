package com.lin.mapper;

import com.lin.entity.Message;
import com.lin.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT id,name FROM user WHERE id = #{id}")
    User getUser(Long id);

    @Insert("INSERT INTO user (id,name) VALUES (#{id}, #{name})")
    int insertUser(User user);

}
