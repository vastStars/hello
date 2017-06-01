package com.hello.core.interceptor;

import org.slf4j.MDC;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zili.wang 2017/5/31 16:42
 * @version 1.0
 * @name LogbackMonitorInterceptor
 * @description
 **/
public class LogbackMonitorInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        MDC.put("userId","10001");
        return super.preHandle(request, response, handler);
    }
}
