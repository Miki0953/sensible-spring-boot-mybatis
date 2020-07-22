package com.sensible.service;

import com.sensible.model.User;

/**
 * @author liuyc
 * @Description: 用户信息业务接口
 * @date 2020/7/16 001612:06
 */
public interface UserService {
    /**
     * 根据主键id获取User对象
     * @param id
     * @return
     */
    User getById(String id);

    /**
     * 新增
     * @param user
     * @return
     */
    Integer save(User user);
}
