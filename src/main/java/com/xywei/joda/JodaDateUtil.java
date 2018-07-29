package com.xywei.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class JodaDateUtil {


    public static void main(String[] args) {
        DateTime dt = new DateTime();
        int month = dt.getMonthOfYear(); // 月，1月值为1，12月值为12
        int year = dt.getYear(); // 年


        String monthName = dt.monthOfYear().getAsText(); // 四月
        System.out.println(monthName);
        boolean isLeapYear = dt.year().isLeap();  // false

        System.out.println(isLeapYear);


        LocalDate localDate = new LocalDate(2009, 9, 6);// September 6, 2009
        LocalTime localTime = new LocalTime(13, 30, 26, 0);// 1:30:26PM
    }



}
