package com.sensible.controllor;

import com.sensible.model.User;
import com.sensible.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyc
 * @Description: 用户控制器
 * @date 2020/7/16 001612:10
 */
@RestController
@RequestMapping("user")
public class UserControllor {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public User getUser(){
        return userService.getById("1");
    }

    @RequestMapping(value = "saveUser",method = RequestMethod.GET)
    public Integer saveUser(){
        User user = new User();
        user.setName("6666666666666");
        userService.save(user);
        return user.getId().intValue();
    }
}
