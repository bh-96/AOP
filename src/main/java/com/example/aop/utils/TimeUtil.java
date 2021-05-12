package com.example.aop.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    public static String getNowTimeStr(String format) {
        try {
            return new SimpleDateFormat(format).format(new Date());
        } catch (Exception e) {
            return null;
        }
    }

}
