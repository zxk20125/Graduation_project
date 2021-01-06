package cn.zxk.controller;

import cn.zxk.service.UserServiceImp;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private UserServiceImp userServiceImp;

    @RequestMapping("/test")
    public String test() {
        return "";
    }

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("/login")
    public String userLogin(String username, String password) {
        try {
            userServiceImp.checkLogin(username, password);
            System.out.println("登录成功！");
            return "redirect:/loginSuccess";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("登录异常！");
            return "redirect:/noPermission";
        }
    }

    /**
     * @RequiresRoles 这个注解死Shiro提供的 用于标签类或当前在访问时必须需要什么样的角色
     * 属性
     *    value 取值为String 数组类型 用于指定访问时多需要的一个或多个角色名
     *    logical取值为Logical.AND或Logical.OR 表示并且和或的意思，默认值为AND
     * @return
     */
    @RequiresRoles("admin")
    @RequestMapping("/loginSuccess")
    public String loginSuccess() {
        Subject subject= SecurityUtils.getSubject();
        subject.logout();
        return "index";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/";
    }

    @RequestMapping("/noPermission")
    public String noPermission() {
        Subject subject= SecurityUtils.getSubject();
        subject.logout();
        return "noPermission";
    }
}
