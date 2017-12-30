package com.megvii.demo.service;


import com.megvii.demo.po.User;

import java.util.List;

public interface UserService {

    boolean insert(User user);


    boolean delete(String pk);


    boolean update(User user);


    User selectByPK(String pk);


    List<User> query(User user);
}
