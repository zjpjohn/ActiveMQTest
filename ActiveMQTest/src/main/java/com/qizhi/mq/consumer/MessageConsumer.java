package com.qizhi.mq.consumer;

import com.qizhi.mq.entity.User;
import com.qizhi.mq.service.UserService;
import com.qizhi.mq.util.JsonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;


/**
 * author:zjprevenge
 * time: 2016/6/29
 * copyright all reserved
 */
public class MessageConsumer extends AbstractReqRespConsumer {

    private static final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @Resource
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void handleMessage(Object o) {
        String message = (String) o;
        User user = null;
        try {
            user = JsonMapper.toBean(message, User.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        userService.addUser(user);
        //测试消息处理与消息接收在同一事务中
//        System.out.println(1/0);
    }

}
