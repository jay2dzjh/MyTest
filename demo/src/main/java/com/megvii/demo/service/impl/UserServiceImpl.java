package com.megvii.demo.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.megvii.biz.core.service.AbstractService;
import com.megvii.demo.service.UserService;
import com.megvii.demo.po.User;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends AbstractService implements UserService {

    public boolean insert(User model) {
        return super.insert(model);
    }

    public boolean delete(String pk) {
        // TODO Auto-generated method stub
        return super.delete(pk);
    }

    public boolean update(User model) {
        // TODO Auto-generated method stub
        return super.update(model);
    }

    public User selectByPK(String pk) {
        // TODO Auto-generated method stub
        return super.selectByPK(pk);

    }

    public List<User> query(User model) {
        // TODO Auto-generated method stub
        return super.query(model);
    }

}
