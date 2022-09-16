package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yhw
 * @version 1.0
 **/
//springMVC中的过滤器是 继承 HandlerInterceptor
public class FirstInterceptor implements HandlerInterceptor {
    //控制器方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("FirstInterceptor-----preHandle");


        //拦截或者放行  true放行
        return true;
    }

    //控制器方法执行之后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("FirstInterceptor-----postHandle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }


    //渲染完视图后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("FirstInterceptor-----afterCompletion");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
