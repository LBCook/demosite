package com.lin;

import com.lin.entity.Message;
import com.lin.entity.User;
import com.lin.mapper.MessageMapper;
import com.lin.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class ConsumeroneApplicationTests {

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    void getMessageTest() {
        Message message = messageMapper.getMessage(1l);
        System.out.println(message.toString());
    }

    @Test
    void insertMessageTest() {
        Message message = new Message();
        message.setUserId(1);
        message.setMessage("goot");
        int i = messageMapper.insertMessage(message);
        System.out.println(i);
        System.out.println(message.toString());
    }

    @Test
    void getUserTest() {
        User user = userMapper.getUser(1l);
        System.out.println(user.toString());
    }

    @Test
    void insertUserTest() {
        User user = new User();
        user.setId(2);
        user.setName("over");
        int i = userMapper.insertUser(user);
        System.out.println(i);
        System.out.println(user.toString());
    }


    /**
     * 单库测试事务
     * 添加 @Transactional 后中间如果有报错会进行回滚
     */
    @Test
    @Transactional
    void testTranstionOnOne() {
        User user = new User();
        user.setId(3);
        user.setName("three");
        int i = userMapper.insertUser(user);
        System.out.println(i);
        System.out.println(user.toString());

        int error = 1 / 0;

        Message message = new Message();
        message.setUserId(1);
        message.setMessage("goot");
        int ii = messageMapper.insertMessage(message);
        System.out.println(ii);
        System.out.println(message.toString());
    }

}
