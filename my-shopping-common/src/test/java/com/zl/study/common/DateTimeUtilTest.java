package com.zl.study.common;

import com.zl.study.common.utils.DateTimeUtil;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 项目名:my-shopping-parent
 *
 * @Author:ZENLIN
 * @Created 2019/1/10  9:19.
 */
public class DateTimeUtilTest {
    private String time1 = "2019-01-10 12:21:32";
    private String time2 = "2019/01/10 12:21:32";
    private String time3 = "2019/02/10 12:21:32";
    private String time4 = "2019-01-15 12:21:32";

    private String pattern1 = "yyyy/MM/dd";
    private String pattern2 = "yyyy/MM/dd HH:mm:ss";
    private String pattern3 = "yyyy-MM-dd 00:00:00";
    private String pattern4 = "yyyy-MM-dd 23:59:59";


    @Test
    public void nowDateString() {
        String nowDateString = DateTimeUtil.nowDateString();
        System.out.println("nowDateString = " + nowDateString);
    }

    @Test
    public void yesterdayDateString() {
        String yesterdayDateString = DateTimeUtil.yesterdayDateString();
        System.out.println("yesterdayDateString = " + yesterdayDateString);
        yesterdayDateString = DateTimeUtil.yesterdayDateTimeString(pattern3);
        System.out.println("yesterdayDateTimeString = " + yesterdayDateString);
    }


    @Test
    public void timestampToString() {
        String timestampToString = DateTimeUtil.timestampToString(System.currentTimeMillis());
        System.out.println("timestampToString = " + timestampToString);
    }

    @Test
    public void stringToTimestamp() {
        Long aLong = DateTimeUtil.stringToTimestamp(time1);
        System.out.println("aLong = " + aLong);
        aLong = DateTimeUtil.stringToTimestamp(time2, pattern2);
        System.out.println("aLong = " + aLong);
    }

    @Test
    public void stringPlusSeconds() {
        String stringPlusSeconds = DateTimeUtil.stringPlusSeconds(time1, -1);
        assert stringPlusSeconds.equals("2019-01-10 12:21:31");
        stringPlusSeconds = DateTimeUtil.stringPlusSeconds(time2, pattern2, -1);
        assert stringPlusSeconds.equals("2019/01/10 12:21:31");
    }

    @Test
    public void stringPlusMinutes() {
        String stringPlusMinutes = DateTimeUtil.stringPlusMinutes(time1, -1);
        assert stringPlusMinutes.equals("2019-01-10 12:20:32");
        stringPlusMinutes = DateTimeUtil.stringPlusMinutes(time2, pattern2, -1);
        assert stringPlusMinutes.equals("2019/01/10 12:20:32");
    }

    @Test
    public void stringPlusHours() {
        String stringPlusHours = DateTimeUtil.stringPlusHours(time1, -1);
        assert stringPlusHours.equals("2019-01-10 11:21:32");
        stringPlusHours = DateTimeUtil.stringPlusHours(time2, pattern2, -1);
        assert stringPlusHours.equals("2019/01/10 11:21:32");
    }

    @Test
    public void stringPlusDays() {
        String stringPlusHours = DateTimeUtil.stringPlusDays(time1, -1);
        assert stringPlusHours.equals("2019-01-09 12:21:32");
        stringPlusHours = DateTimeUtil.stringPlusDays(time2, pattern2, -1);
        assert stringPlusHours.equals("2019/01/09 12:21:32");
    }

    @Test
    public void stringPlusMonths() {
        String stringPlusHours = DateTimeUtil.stringPlusMonths(time1, 1);
        assert stringPlusHours.equals("2019-02-10 12:21:32");
        stringPlusHours = DateTimeUtil.stringPlusMonths(time2, pattern2, 1);
        assert stringPlusHours.equals("2019/02/10 12:21:32");
    }

    @Test
    public void stringPlusYears() {
        String stringPlusHours = DateTimeUtil.stringPlusYears(time1, 1);
        assert stringPlusHours.equals("2020-01-10 12:21:32");
        stringPlusHours = DateTimeUtil.stringPlusYears(time2, pattern2, 1);
        assert stringPlusHours.equals("2020/01/10 12:21:32");
    }

    @Test
    public void listDay() {
        String firstDayDateOfWeek = DateTimeUtil.firstDayDateOfWeek();
        String nowDateString = DateTimeUtil.nowDateString();
        List<String> list = DateTimeUtil.listDay(firstDayDateOfWeek, nowDateString);
        System.out.println("list = " + list);
        list = DateTimeUtil.listDay(time2, time3, pattern2);
        System.out.println("list = " + list);
        list = DateTimeUtil.listDay(time1, time4, DateTimeUtil.FORMAT_STANDARD_DATETIME, pattern1);
        System.out.println("list = " + list);
    }

    @Test
    public void firstDayDateOfWeek() {
        String firstDayDateOfWeek = DateTimeUtil.firstDayDateOfWeek();
        System.out.println("firstDayDateOfWeek = " + firstDayDateOfWeek);
        firstDayDateOfWeek = DateTimeUtil.firstDayDateTimeOfWeek(pattern3);
        System.out.println("firstDayDateTimeOfWeek = " + firstDayDateOfWeek);
    }

    @Test
    public void lastDayDateOfWeek() {
        String lastDayDateOfWeek = DateTimeUtil.lastDayDateOfWeek();
        System.out.println("lastDayDateOfWeek = " + lastDayDateOfWeek);
        lastDayDateOfWeek = DateTimeUtil.lastDayDateTimeOfWeek(pattern4);
        System.out.println("lastDayDateTimeOfWeek = " + lastDayDateOfWeek);
    }

    @Test
    public void weekDate() {
        List<String> list = DateTimeUtil.listCurrentWeekDate();
        System.out.println("list = " + list);
        list = DateTimeUtil.listCurrentWeekDate(false);
        System.out.println("list = " + list);
    }


    @Test
    public void firstDayDateOfMonth() {
        String firstDayDateOfMonth = DateTimeUtil.firstDayDateOfMonth();
        System.out.println("firstDayDateOfMonth = " + firstDayDateOfMonth);
        firstDayDateOfMonth = DateTimeUtil.firstDayDateTimeOfMonth(pattern3);
        System.out.println("firstDayDateTimeOfMonth = " + firstDayDateOfMonth);
    }

    @Test
    public void lastDayDateOfMonth() {
        String lastDayDateOfMonth = DateTimeUtil.lastDayDateOfMonth();
        System.out.println("lastDayDateOfMonth = " + lastDayDateOfMonth);
        lastDayDateOfMonth = DateTimeUtil.lastDayDateTimeOfMonth(pattern4);
        System.out.println("lastDayDateTimeOfMonth = " + lastDayDateOfMonth);
    }

    @Test
    public void monthDate() {
        List<String> list = DateTimeUtil.listCurrentMonthDate();
        System.out.println("list = " + list);
        list = DateTimeUtil.listCurrentMonthDate(false);
        System.out.println("list = " + list);
    }


    @Test
    public void firstDayDateOfYear() {
        String firstDayDateOfYear = DateTimeUtil.firstDayDateOfYear();
        System.out.println("firstDayDateOfYear = " + firstDayDateOfYear);
        firstDayDateOfYear = DateTimeUtil.firstDayDateTimeOfYear(pattern3);
        System.out.println("firstDayDateTimeOfYear = " + firstDayDateOfYear);
    }

    @Test
    public void lastDayDateOfYear() {
        String lastDayDateOfYear = DateTimeUtil.lastDayDateOfYear();
        System.out.println("lastDayDateTimeOfYear = " + lastDayDateOfYear);
        lastDayDateOfYear = DateTimeUtil.lastDayDateTimeOfYear(pattern4);
        System.out.println("lastDayDateTimeOfYear = " + lastDayDateOfYear);
    }

    @Test
    public void yearDate() {
        List<String> list = DateTimeUtil.listCurrentYearDate();
        System.out.println("list = " + list);
        list = DateTimeUtil.listCurrentYearDate(false);
        System.out.println("list = " + list);
    }

    @Test
    public void getCurrentDayDateTime() {
        Map<String, String> currentDayDateTime = DateTimeUtil.getCurrentDayDateTime();
        System.out.println("currentDayDateTime = " + currentDayDateTime);
    }

    @Test
    public void getCurrentWeekDate() {
        Map<String, String> currentWeekDate = DateTimeUtil.getCurrentWeekDate();
        System.out.println("currentWeekDate = " + currentWeekDate);
        currentWeekDate = DateTimeUtil.getCurrentWeekDate(false);
        System.out.println("currentWeekDate = " + currentWeekDate);
        currentWeekDate = DateTimeUtil.getCurrentWeekDateTime();
        System.out.println("getCurrentWeekDateTime = " + currentWeekDate);
        currentWeekDate = DateTimeUtil.getCurrentWeekDateTime(false);
        System.out.println("getCurrentWeekDateTime = " + currentWeekDate);
    }

    @Test
    public void getCurrentMonthDate() {
        Map<String, String> currentMonthDate = DateTimeUtil.getCurrentMonthDate();
        System.out.println("currentMonthDate = " + currentMonthDate);
        currentMonthDate = DateTimeUtil.getCurrentMonthDate(false);
        System.out.println("currentMonthDate = " + currentMonthDate);
        currentMonthDate = DateTimeUtil.getCurrentMonthDateTime();
        System.out.println("getCurrentMonthDateTime = " + currentMonthDate);
        currentMonthDate = DateTimeUtil.getCurrentMonthDateTime(false);
        System.out.println("getCurrentMonthDateTime = " + currentMonthDate);
    }

    @Test
    public void getCurrentYearDate() {
        Map<String, String> getCurrentYearDate = DateTimeUtil.getCurrentYearDate();
        System.out.println("getCurrentYearDate = " + getCurrentYearDate);
        getCurrentYearDate = DateTimeUtil.getCurrentYearDate(false);
        System.out.println("currentMonthDate = " + getCurrentYearDate);
        getCurrentYearDate = DateTimeUtil.getCurrentYearDateTime();
        System.out.println("getCurrentYearDateTime = " + getCurrentYearDate);
        getCurrentYearDate = DateTimeUtil.getCurrentMonthDateTime(false);
        System.out.println("getCurrentYearDateTime = " + getCurrentYearDate);
    }
}
