package com.example.aop.config.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class TestInterceptor extends HandlerInterceptorAdapter {

    /**
     * 컨트롤러 실행 직전에 동작
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("Interceptor > preHandle");
        return true;
    }

    /**
     * 컨트롤러 진입 후 view 가 랜더링 되기 전에 동작
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("Interceptor > postHandle");
    }

    /**
     * 컨트롤러 진입 후 view 가 정상적으로 랜더링 되고 제일 마지막에 동작
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception arg3) throws Exception {
        log.info("Interceptor > afterCompletion" );
    }

}
