package com.iyut.base.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iyut.base.user.mapper.MemberMapper;
import com.iyut.base.user.model.domain.Member;
import com.iyut.base.user.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * @author iyut
 */
@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
