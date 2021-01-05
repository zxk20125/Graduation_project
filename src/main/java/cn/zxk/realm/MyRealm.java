package cn.zxk.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

/**
 * 自定义的realm用来实现用户的认证和授权
 * 父类AuthenticatingRealm 只做用户认证（登录）
 */
public class MyRealm extends AuthorizingRealm {
    /**
     * 用户认证方法 这个方法不能手动调用
     * @param authenticationToken  存放用户的账号密码
     * @return
     * @throws AuthenticationException 如果认证失败shiro会报异常
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token= (UsernamePasswordToken) authenticationToken;
        String username=token.getUsername();
        String password = String.valueOf(token.getPassword());
        System.out.println(username+"  "+password);
        /**
         * 数据加密主要时防止数据在浏览器到后台服务器之间的数据传递时被截获
         */
        //设置让当前登录用户中的密码数据进行加密
        /*HashedCredentialsMatcher credentialsMatcher= new HashedCredentialsMatcher();
        credentialsMatcher.setHashAlgorithmName("MD5");
        credentialsMatcher.setHashIterations(1);
        this.setCredentialsMatcher(credentialsMatcher);
        //对数据库进行加密
        SimpleHash md5 = new SimpleHash("MD5", "123456", "", 1);*/

        /**
         * 创建密码认证对象，由shiro自动认证密码
         * 参数1 数据库中的账号
         * 参数2 为数据中读取数据来的密码
         * 参数3 为当前realm的名字
         * 如果密码认证成功则返回一个用户身份对象，如果密码认证失败shiro会抛出异常
         */
        return new SimpleAuthenticationInfo(username,password,getName());
    }

    /**
     * 用户授权的方法，当用户认证通过每次访问徐娅授权的请求时都需要这段代码
     * 这里该使用数据库来获取当前用户的所有角色和权限，并设置到shiro中
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户的账号，根据账号来从数据库中获取数据
        Object obj=principalCollection.getPrimaryPrincipal();
        Set<String> roles=new HashSet<>();
        if("root".equals(obj)){
            System.out.println(obj+"正在授权");
            roles.add("admin");
        }
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.setRoles(roles);
        return info;
    }


}
