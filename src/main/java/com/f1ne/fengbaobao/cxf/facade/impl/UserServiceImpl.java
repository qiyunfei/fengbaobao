package com.f1ne.fengbaobao.cxf.facade.impl;

import com.f1ne.fengbaobao.cxf.bean.User;
import com.f1ne.fengbaobao.cxf.facade.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: com.f1ne.fengbaobao.cxf.facade.impl
 * @description:
 * @author: qiyunfei
 * @create: 2018-2018-12 16:11
 **/
@Service
public class UserServiceImpl implements UserService {
    private static Map<Long, User> userMap = new HashMap<>();
    static {
        User user = new User();
        user.setUserId(10001L);
        user.setUsername("liyd1");
        user.setEmail("liyd1@qq.com");
        user.setGmtCreate(new Date());
        userMap.put(user.getUserId(), user);
        user = new User();
        user.setUserId(10002L);
        user.setUsername("liyd2");
        user.setEmail("liyd2@qq.com");
        user.setGmtCreate(new Date());
        userMap.put(user.getUserId(), user);
        user = new User();
        user.setUserId(10003L);
        user.setUsername("liyd3");
        user.setEmail("liyd3@qq.com");
        user.setGmtCreate(new Date());
        userMap.put(user.getUserId(), user);
    }

    @Override
    public String getName(Long userId) {
        return "liyd-" + userId;
    }
    @Override
    public User getUser(Long userId) {
        return userMap.get(userId);
    }
}
