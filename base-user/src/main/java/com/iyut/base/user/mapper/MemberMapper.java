package com.iyut.base.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iyut.base.user.model.domain.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author iyut
 * 用户mapper类
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {
}
