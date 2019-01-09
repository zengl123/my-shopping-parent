package com.zl.study.common.utils;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import java.time.Instant;
import java.util.Date;

/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.common.utils
 * @ClassName DateUtil
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-14 下午9:36
 * @Version 1.0
 * @Modified By
 */
public class DateTimeUtil {
    /**
     * 标准时间格式化
     */
    public static final String FORMAT_STANDARD = "yyyy-MM-dd HH:mm:ss";


    /**
     * 时间格式化
     *
     * @return
     */
    public static DateTimeFormatter dtf(String pattern) {
        return DateTimeFormat.forPattern(pattern);
    }

    /**
     * 获取当前时间
     *
     * @return
     */
    public static String nowDateTimeString() {
        return LocalDateTime.now().toString(FORMAT_STANDARD);
    }

    public static String nowDateTimeString(String pattern) {
        return LocalDateTime.now().toString(pattern);
    }

    public static Date nowDateTimeDate() {
        return LocalDateTime.now().toDate();
    }

    public static Long nowDateTimeTimestamp() {
        return Instant.now().getEpochSecond();
    }

    /**
     * @param time 2019-01-09 17:19:14
     * @return
     */
    public static LocalDateTime stringToLocalDateTime(String time) {
        return LocalDateTime.parse(time, dtf(FORMAT_STANDARD));
    }

    /**
     * 格式化字符串日期转LocalDateTime(时间格式保持一致)
     *
     * @param time    2019-01-09 17:19
     * @param pattern yyyy-MM-dd HH:mm
     * @return
     */
    public static LocalDateTime stringToLocalDateTime(String time, String pattern) {
        return LocalDateTime.parse(time, dtf(pattern));
    }

    /**
     * @param time
     * @return
     */
    public static Date stringToDate(String time) {
        return stringToLocalDateTime(time).toDate();
    }

    /**
     * 格式化字符串日期转Date(时间格式保持一致)
     *
     * @param time    2019-01-09 17:19
     * @param pattern yyyy-MM-dd HH:mm
     * @return
     */
    public static Date stringToDate(String time, String pattern) {
        return stringToLocalDateTime(time, pattern).toDate();
    }

    /**
     * @param time
     * @return
     */
    public static Long stringToTimestamp(String time) {
        return stringToDate(time).getTime();
    }

    /**
     * 格式化字符串日期转Timestamp(时间格式保持一致)
     *
     * @param time    2019-01-09 17:19
     * @param pattern yyyy-MM-dd HH:mm
     * @return
     */
    public static Long stringToTimestamp(String time, String pattern) {
        return stringToDate(time, pattern).getTime();
    }


    public static String timestampToString(Long timestamp) {
        Date date = new Date(timestamp);
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(FORMAT_STANDARD);
    }

    @Test
    public void test() {
        String nowDateTimeString = nowDateTimeString();
        System.out.println("nowDateTimeString = " + nowDateTimeString);
        String pattern = "yyyy-MM-dd";
        nowDateTimeString = nowDateTimeString(pattern);
        System.out.println("nowDateTimeString = " + nowDateTimeString);
        Date nowDateTimeDate = nowDateTimeDate();
        System.out.println("nowDateTimeDate = " + nowDateTimeDate);
        long nowDateTimeTimestamp = nowDateTimeTimestamp();
        System.out.println("nowDateTimeTimestamp = " + nowDateTimeTimestamp);
        //
        String time1 = "2019-01-09 17:08:38";
        String time2 = "2019-01-09 17:08";
        pattern = "yyyy-MM-dd HH:mm";
        LocalDateTime localDateTime = stringToLocalDateTime(time1);
        System.out.println("localDateTime = " + localDateTime);
        localDateTime = stringToLocalDateTime(time2, pattern);
        System.out.println("localDateTime = " + localDateTime);

        Date stringToDate = stringToDate(time1);
        System.out.println("stringToDate = " + stringToDate);
        stringToDate = stringToDate(time2, pattern);
        System.out.println("stringToDate = " + stringToDate);

        Long aLong = stringToTimestamp(time1);
        System.out.println("aLong = " + aLong);
        aLong = stringToTimestamp(time2, pattern);
        System.out.println("aLong = " + aLong);

        String timestampToString = timestampToString(aLong);
        System.out.println("timestampToString = " + timestampToString);

    }
}
