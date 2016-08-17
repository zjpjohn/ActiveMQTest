package com.qizhi.mq.service.impl;

import com.qizhi.mq.entity.User;
import com.qizhi.mq.mapper.UserMapper;
import com.qizhi.mq.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * author:zjprevenge
 * time: 2016/6/29
 * copyright all reserved
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    /**
     * 根据用户id获取用户
     *
     * @param id
     * @return
     */
    public User selectUserById(Integer id) {
        if (id == null) {
            return null;
        }
        log.info("根据用户id获取用户信息...");
        return userMapper.selectUserById(id);
    }

    /**
     * 根据用户名获取用户
     *
     * @param name
     * @return
     */
    public User selectUserByName(String name) {
        if (StringUtils.isBlank(name)) {
            return null;
        }
        return userMapper.selectUserByName(name);
    }

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int updateUser(User user) {
        if (user == null) {
            return 0;
        }
        return userMapper.updateUser(user);
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Transactional
    public void addUser(User user) {
        if (user == null) {
            return ;
        }
        userMapper.addUser(user);
//        System.out.println(1/0);
    }
}
