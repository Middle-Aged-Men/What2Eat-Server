package com.middle.aged.men.controller.user;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @ApiOperation(value="获取用户", notes="test")
    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public String list() {
      return "user";

    }

}
