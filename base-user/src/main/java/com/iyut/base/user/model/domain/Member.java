package com.iyut.base.user.model.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author iyut
 * 用户实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Member extends BaseEntity {

    private String loginName;

    private String userName;

    private String passWord;
}

