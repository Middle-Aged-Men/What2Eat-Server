package com.middle.aged.men.web.controller.user;

import com.middle.aged.men.entity.model.Message;
import com.middle.aged.men.entity.model.ResultModel;
import com.middle.aged.men.entity.user.vo.UserVo;
import com.middle.aged.men.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @Resource
    UserService userService;

    @ApiOperation(value = "获取用户", notes = "test")
    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    public String list() {
        return "user";
    }


    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    @ApiOperation(value = "添加用户", notes = "unionid")
    public Message addUser(@RequestBody UserVo userVo) {
        ResultModel resultModel = userService.addUser(userVo.getUnionId());
        return resultModel.toMessage();
    }

    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    @ApiOperation(value = "获取数据库中所有用户", notes = "")
    public Message getUsers() {
        ResultModel resultModel = userService.getUserList();
        return resultModel.toMessage();
    }


}
