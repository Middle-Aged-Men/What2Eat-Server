package com.middle.aged.men.dao.user;

import com.middle.aged.men.entity.user.User;

import java.util.List;

public interface UserMapper {

    public int insert(User user);

    public List<User> getUserList();

}
