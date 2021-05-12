package com.example.aop.controller;

import com.example.aop.utils.LoggerUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilterTestController extends LoggerUtil {

    @PostMapping(value = "/filter")
    public ResponseEntity<?> filterTest(@RequestBody String message) {
        String returnMsg = "{\"message\":\"" + message + "\"}";
        return new ResponseEntity<>(returnMsg, HttpStatus.OK);
    }

}
