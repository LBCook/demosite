package com.lin.entity;

import lombok.Data;

// data注解，不需要手动生成get set，其实也是挺好
@Data
public class Message {
    int id;
    int userId;
    String message;
}
