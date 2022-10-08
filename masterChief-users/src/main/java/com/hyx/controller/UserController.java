package com.hyx.controller;

import com.hyx.domain.vo.LoginVO;
import com.hyx.domain.vo.RegisterVO;
import com.hyx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关接口.
 *
 * @author hyx
 **/

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    /**
     * 登录接口.
     * @param loginVO 登录接口VO,现有account与password
     * @return token.
     */
    @RequestMapping("/login")
    public String login(LoginVO loginVO) {
        String account = loginVO.getAccount();
        String password = loginVO.getPassword();
        return userService.login(account, password);
    }
    
    /**
     * 注册接口.
     * @param registerVO 注册接口VO,现有email与password
     * @return 账号.
     */
    @RequestMapping("/register")
    public String register(RegisterVO registerVO) {
        String email = registerVO.getEmail();
        String password = registerVO.getPassword();
        return userService.register(email, password);
    }
    
}
