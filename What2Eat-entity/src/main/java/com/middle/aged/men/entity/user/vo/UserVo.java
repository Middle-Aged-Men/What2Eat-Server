package com.middle.aged.men.entity.user.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserVo {
    private Integer userId;

    private String unionId;

    private Date createTime;

}
