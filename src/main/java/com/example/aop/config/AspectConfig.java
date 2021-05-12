package com.example.aop.config;

import com.example.aop.utils.LoggerUtil;
import com.example.aop.utils.TimeUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * AOP : 로직을 핵심적인 관점과 부가적인 관점으로 나누어 보고 관점을 기준으로 모듈화 하는 프로그래밍
 * (관점 지향 프로그래밍)
 */
@Aspect
@Configuration
public class AspectConfig extends LoggerUtil {

    /**
     * 대상 메소드 실행 전에 끼어 들어 작업 수행 (대상 메소드의 제어나 가공은 불가능)
     *  -> execution : PointCut 끼어들 메소드의 범위 지정
     */
    @Before("execution(* com.example.aop.controller.AopTestController.aopTest())")
    public void doSomethingBefore(JoinPoint joinPoint) {
        logger.info("@Before : " + TimeUtil.getNowTimeStr("yyyy-MM-dd HH:mm:ss:SSS"));
    }

    /**
     * 대상 메소드 실행 후에 끼어 들어 작업 수행 (대상 메소드의 제어나 가공은 불가능)
     */
    @After("execution(* com.example.aop.controller.AopTestController.aopTest())")
    public void doSomethingAfter(JoinPoint joinPoint) {
        logger.info("@After : " + TimeUtil.getNowTimeStr("yyyy-MM-dd HH:mm:ss:SSS"));
    }

    /**
     * 대상 메소드가 종료되어 값을 리턴할 때 끼어 들어 작업 수행
     */
    @AfterReturning(pointcut = "execution(* com.example.aop.controller.AopTestController.aopTest()))", returning = "result")
    public void doSomethingAfterReturning(JoinPoint joinPoint, Object result) {
        logger.info("@AfterReturning : " + TimeUtil.getNowTimeStr("yyyy-MM-dd HH:mm:ss:SSS"));
    }

    /**
     * 대상 메소드의 실행 전후 시점에 원하는 작업 수행 (대상 메소드의 제어나 가공 가능)
     */
    @Around("@annotation(someAnnotation)")
    public Object doSomethingAround(final ProceedingJoinPoint joinPoint, final Service someAnnotation) {
        try {
            Object result = joinPoint.proceed();
            logger.info("@Around : " + TimeUtil.getNowTimeStr("yyyy-MM-dd HH:mm:ss:SSS"));
            return result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return null;
    }

}
