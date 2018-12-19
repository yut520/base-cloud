package com.iyut.base.user.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author iyut
 * 实体基础类
 */
@Data
class BaseEntity {

    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;
}
