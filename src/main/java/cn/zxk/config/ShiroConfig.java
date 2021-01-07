//package cn.zxk.config;
//
//import cn.zxk.realm.MyRealm;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.realm.text.IniRealm;
//import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashMap;
//import java.util.Map;
//
////标记当前类是一个Spring配置类
//@Configuration
//public class ShiroConfig {
//    /**
//     * 配置一个安全管理器
//     * @return
//     */
//    @Bean
//    public IniRealm getIniRealm(){
//        return new IniRealm("src/main/resources/shiro.ini");
//    }
//    @Bean
//    public DefaultWebSecurityManager getSecurityManager(IniRealm getIniRealm){
//        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
//        //securityManager需要完成校验，需要realm
//        securityManager.setRealm(new MyRealm());
//        return  securityManager;
//    }
//    @Bean
//    public ShiroFilterFactoryBean shiroFilter(DefaultWebSecurityManager getSecurityManager){
//        ShiroFilterFactoryBean filter =new ShiroFilterFactoryBean();
//        //过滤器就是shiro进行校验的核心，进行认证和授权是需要securityManager的
//        filter.setSecurityManager(getSecurityManager);
//        filter.setLoginUrl("/");
//        filter.setSuccessUrl("/index");
//        filter.setUnauthorizedUrl("/noPermission");
//        //设置shiro的拦截规则
//        //anon    匿名用户可访问
//        //authc   认证用户可访问
//        //user    使用RemberMe的用户可访问
//        //perms   对应权限可访问
//        //role    对应角色可访问
//        Map<String,String> filterMap= new HashMap<>();
//        filterMap.put("/","anon");
//        filterMap.put("/login","anon");
//        filterMap.put("/WMS","anon");
//        //配置剩余的请求都需要认证
//        filterMap.put("/**","anon");
//        filterMap.put("/noPermission","anon");
//        //设置未授权访问的页面路径
//        filter.setFilterChainDefinitionMap(filterMap);
//        return filter;
//    }
//    /**
//     * 开启shiro的注解支持（类似@RequiresRoles）和@RequiresPermissions
//     * shiro的注解需要Spring的AOP来实现
//     * @return
//     */
//    @Bean
//    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
//        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator=new DefaultAdvisorAutoProxyCreator();
//        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
//        return defaultAdvisorAutoProxyCreator;
//    }
//
//    /**
//     * 开启AOP的支持
//     * @param securityManager
//     * @return
//     */
//    @Bean
//    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
//        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor=new AuthorizationAttributeSourceAdvisor();
//        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
//        return authorizationAttributeSourceAdvisor;
//    }
//}
