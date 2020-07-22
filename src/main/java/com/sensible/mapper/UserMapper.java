package com.sensible.mapper;

import com.sensible.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liuyc
 * @Description: 用户mapper接口
 * @date 2020/7/16 001611:43
 */
@Mapper
public interface UserMapper {

    User getById(String id);

    Integer insert(User user);
}
