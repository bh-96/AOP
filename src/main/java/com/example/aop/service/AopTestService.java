package com.example.aop.service;

import com.example.aop.utils.LoggerUtil;
import com.example.aop.utils.TimeUtil;
import org.springframework.stereotype.Service;

@Service
public class AopTestService extends LoggerUtil {

    public void aroundTest() {
        logger.info("aroundTest : " + TimeUtil.getNowTimeStr("yyyy-MM-dd HH:mm:ss:SSS"));
    }

}
