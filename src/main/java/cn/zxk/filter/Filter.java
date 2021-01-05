package cn.zxk.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 使用注解创建过滤器
 */
//声明过滤器
//@WebFilter(urlPatterns = "/*",filterName = "MyFilter")
//声明过滤器顺序
//@Order(1)
public class Filter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("myFilter被初始化了");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String URI = request.getRequestURI();
        String method = request.getMethod();
        System.out.println("请求的URI:"+URI+"  请求的方式:"+method);
        //判断是否携带凭证
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
