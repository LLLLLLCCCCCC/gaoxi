package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.commonservicefacade.LoginReq;
import com.commonservicefacade.UserEntity;
import com.commonservicefacade.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

/**
 * @Company：首都信息发展股份有限公司
 * @Description：
 * @Author：liuchuang
 * @Date：2018/2/9
 */
@RestController
public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    private UserService userService;
    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);
        return null;
    }
}
