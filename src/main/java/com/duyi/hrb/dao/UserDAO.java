package com.duyi.hrb.dao;

import com.duyi.hrb.domain.User;

public interface UserDAO {

    User findByName(User user);

}
