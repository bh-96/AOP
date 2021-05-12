package com.example.aop.controller;

import com.example.aop.utils.LoggerUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorTestController extends LoggerUtil {

    @GetMapping(value = "/interceptor")
    public ResponseEntity<?> interceptorTest() {
        logger.info("interceptorTest");
        return new ResponseEntity<>("end", HttpStatus.OK);
    }

}
