package com.duyi.hrb.service;

import com.duyi.hrb.dao.UserDAO;
import com.duyi.hrb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDAO userDao;

    public User findUserByName(User user) {
        return userDao.findByName(user);
    }
}
