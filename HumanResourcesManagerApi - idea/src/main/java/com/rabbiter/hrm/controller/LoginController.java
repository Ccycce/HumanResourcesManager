package com.rabbiter.hrm.controller;

import com.rabbiter.hrm.entity.Staff;
import com.rabbiter.hrm.dto.ResponseDTO;
import com.rabbiter.hrm.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 登录注册接口
 *
 * @Author : 
 * @Date : 2024/1/30
 */
@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseDTO login(@RequestBody Staff staff) {
        return this.loginService.login(staff);
    }
}
