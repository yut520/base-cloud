package com.iyut.base.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iyut.base.user.common.ResultVO;
import com.iyut.base.user.model.domain.Member;
import com.iyut.base.user.model.vo.MemberVO;
import com.iyut.base.user.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/list")
    public ResultVO list(){
        List<Member> members = memberService.list(new QueryWrapper<>());
        return ResultVO.Builder.SUCC().initSuccData(members.stream().map(x -> {
            MemberVO memberVO = new MemberVO();
            BeanUtils.copyProperties(x, memberVO);
            return memberVO;
        }).collect(Collectors.toList()));
    }
}
