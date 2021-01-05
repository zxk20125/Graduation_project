package cn.zxk.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp {
    public void checkLogin(String username, String password){
        Subject subject= SecurityUtils.getSubject();
        //用户是否认证过
        if(!subject.isAuthenticated()){
            //创建用户认证时的身份令牌
            UsernamePasswordToken token= new UsernamePasswordToken(username,password);
            subject.login(token);
        }
    }
}
