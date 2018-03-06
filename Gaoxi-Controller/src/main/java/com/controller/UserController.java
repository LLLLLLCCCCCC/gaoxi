package com.controller;

import com.commonservicefacade.LoginReq;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

/**
 * @Company：首都信息发展股份有限公司
 * @Description：
 * @Author：liuchuang
 * @Date：2018/2/9
 */
public interface UserController {
    public String login(String name, String pwd);
}
