package com.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.commonservicefacade.LoginReq;
import com.commonservicefacade.UserEntity;
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
    public UserEntity login(LoginReq loginReq) {
        // 具体的实现代码
        return null;
    }
}
