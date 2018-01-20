package com.middle.aged.men.service.user;

import com.middle.aged.men.entity.user.User;
import com.middle.aged.men.entity.model.ReturnModel;

import java.util.List;

public interface UserService {

    public ReturnModel<Boolean> addUser(String unionId);


    public ReturnModel<List<User>> getUserList();

}
