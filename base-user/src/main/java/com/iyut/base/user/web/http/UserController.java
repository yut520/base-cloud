package com.iyut.base.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iyut.base.user.common.ResultVO;
import com.iyut.base.user.model.domain.User;
import com.iyut.base.user.model.vo.UserVO;
import com.iyut.base.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户
 * @author iyut
 */
@RestController
@RequestMapping(value = "/member")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResultVO list(){
        List<User> users = userService.list(new QueryWrapper<>());
        return ResultVO.Builder.SUCC().initSuccData(users.stream().map(x -> {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(x, userVO);
            return userVO;
        }).collect(Collectors.toList()));
    }

    @PostMapping("/getByUsername")
    public ResultVO getByUsername(@RequestParam("username") String username){
        User user = userService.getOne(new QueryWrapper<User>().lambda().eq(User::getLoginName, username));
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return ResultVO.Builder.SUCC().initSuccData(userVO);
    }
}
