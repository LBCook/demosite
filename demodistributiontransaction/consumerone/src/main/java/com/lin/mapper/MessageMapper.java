package com.lin.mapper;

import com.lin.entity.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface MessageMapper {

    @Select("SELECT id,userId,message FROM message WHERE id = #{id}")
    Message getMessage(Long id);

    @Insert("INSERT INTO message (userId,message) VALUES (#{userId}, #{message})")
    int insertMessage(Message message);

}
