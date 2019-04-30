package com.suntak.eightdisciplines.service.impl;

import com.suntak.eightdisciplines.dao.UserDao;
import com.suntak.eightdisciplines.entity.User;
import com.suntak.eightdisciplines.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User loginUser(User user) {
        if(userDao.loginUser(user) >= 1) {
            User u = userDao.getUserInfoByUsername(user.getUsername());
            System.out.println(u);
            return u;
        }else{
            System.out.println("find nothing!!!");
            return null;

        }
    }

    @Override
    public User getUserInfoByUsername(String username) {
        return userDao.getUserInfoByUsername(username);
    }
}
