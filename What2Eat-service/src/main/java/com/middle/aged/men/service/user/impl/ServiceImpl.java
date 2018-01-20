package com.middle.aged.men.service.user.impl;

import com.middle.aged.men.entity.user.User;
import com.middle.aged.men.dao.user.UserMapper;
import com.middle.aged.men.entity.model.ReturnModel;
import com.middle.aged.men.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ReturnModel<Boolean> addUser(String unionId) {
        ReturnModel<Boolean> r = new ReturnModel<Boolean>();
        User user = new User();
        user.setUnionId(unionId);
        user.setCreateTime(new Date());
        int i = userMapper.insert(user);

        if (i == 1) {
            r.setObj(true);
        } else {
            r.setObj(false);
        }

        return r;
    }

    @Override
    public ReturnModel<List<User>> getUserList() {
        ReturnModel<List<User>> r = new ReturnModel<List<User>>();
        List<User> users = userMapper.getUserList();
        r.setObj(users);
        return r;
    }
}
