package com.qizhi.mq.mapper;

import com.qizhi.mq.entity.User;

/**
 * author:zjprevenge
 * time: 2016/6/29
 * copyright all reserved
 */
public interface UserMapper {

    /**
     * 根据用户id获取用户
     *
     * @param id
     * @return
     */
    User selectUserById(Integer id);

    /**
     * 根据用户名获取用户
     *
     * @param name
     * @return
     */
    User selectUserByName(String name);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);
}
