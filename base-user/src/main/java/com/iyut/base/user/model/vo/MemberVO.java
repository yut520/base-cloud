package com.iyut.base.user.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author iyut
 */
@Data
public class MemberVO implements Serializable {

    private static final long serialVersionUID = 4366984982670741159L;

    private String loginName;

    private String userName;

    private String passWord;
}
