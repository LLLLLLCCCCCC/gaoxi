package com.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.commonservicefacade.UserService;

/**
 * @Company：首都信息发展股份有限公司
 * @Description：
 * @Author：liuchuang
 * @Date：2018/2/9
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String login(String name, String pwd) {
        // 具体的实现代码
        if ("liuchuang".equals(name) && "liuchuang".equals(pwd)) {
            return "true";
        } else {
            return "false";
        }
    }
}
