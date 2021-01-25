package com.xiaohu.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ChenHu
 * @Date 2021/1/25 - 22:06
 * @Describe
 **/
@DubboService
public class UserServiceImpl implements UserService{

    private Map<Long, User> usersRepository = new HashMap<>();

    @Override
    public boolean save(User user) {
        return usersRepository.put(user.getId(), user) == null;
    }

    @Override
    public boolean remove(Long userId) {
        return usersRepository.remove(userId) != null;
    }

    @Override
    public Collection<User> findAll() {
        return usersRepository.values();
    }
}
