package com.qizhi.mq.mapper.impl;

import com.qizhi.mq.entity.User;
import com.qizhi.mq.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * author:zjprevenge
 * time: 2016/6/29
 * copyright all reserved
 */
@Repository
public class UserMapperImpl implements UserMapper {

    @Resource
    private SqlSession sqlSession;
    /**
     * 根据用户id获取用户
     *
     * @param id
     * @return
     */
    public User selectUserById(Integer id) {
        return sqlSession.selectOne("com.qizhi.mq.mapper.UserMapper.selectUserById",id);
    }

    /**
     * 根据用户名获取用户
     *
     * @param name
     * @return
     */
    public User selectUserByName(String name) {
        return sqlSession.selectOne("com.qizhi.mq.mapper.UserMapper.selectUserByName",name);
    }

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    public int updateUser(User user) {
        return sqlSession.update("com.qizhi.mq.mapper.UserMapper.updateUser",user);
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    public int addUser(User user) {
        return sqlSession.insert("com.qizhi.mq.mapper.UserMapper.addUser",user);
    }
}
