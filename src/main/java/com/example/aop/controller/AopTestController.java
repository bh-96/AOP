package com.example.aop.controller;

import com.example.aop.service.AopTestService;
import com.example.aop.utils.LoggerUtil;
import com.example.aop.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopTestController extends LoggerUtil {

    private final AopTestService aopTestService;

    @Autowired
    public AopTestController(AopTestService aopTestService) {
        this.aopTestService = aopTestService;
    }

    @GetMapping(value = "/aop")
    public ResponseEntity<?> aopTest() {
        logger.info("aopTest : " + TimeUtil.getNowTimeStr("yyyy-MM-dd HH:mm:ss:SSS"));
        aopTestService.aroundTest();
        return new ResponseEntity<>("end", HttpStatus.OK);
    }

}
