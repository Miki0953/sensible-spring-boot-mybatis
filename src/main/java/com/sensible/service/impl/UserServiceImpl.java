package com.sensible.service.impl;

import com.sensible.mapper.UserMapper;
import com.sensible.model.User;
import com.sensible.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuyc
 * @Description: 用户信息业务实现类
 * @date 2020/7/16 001612:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(String id) {
        return userMapper.getById(id);
    }

    @Override
    public Integer save(User user) {
        return userMapper.insert(user);
    }
}
