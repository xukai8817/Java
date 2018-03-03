package com.edu.chapter.five;

import java.util.Scanner;

/**
 * @author xukai
 * @date 2017年3月2日 上午11:18:52
 *       打印日历
 *       1970.01.01 Thursday
 *       0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 =
 *       Saturday
 */
public class MyCalendar {

    final static int START_WEEK_1970 = 4;   //1970.01.01 Thursday 4
    final static int START_YERA_1970 = 1970;
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份和月份:");
        int year = input.nextInt();
        int month = input.nextInt();
        printTitle(year, month);
        printBody(year, month);
        System.exit(0);
    }

    /**
     * 打印标题
     * @param year
     * @param month
     */
    public static void printTitle(int year, int month) {
        System.out.println("                     " + year + "年" + month + "月");
        System.out.println("---------------------------------------------------");
    }
    
    /**
     * 打印日历详情
     * @param year
     * @param month
     */
    public static void printBody(int year, int month) {
        printWeekTitle();
        int startDayWeek = getStartDayWeek(year, month);
        for (int i = 0; i < startDayWeek; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= getMonthDay(year, month); i++) {
            System.out.printf((++startDayWeek %7 != 0) ? "%2d" + "\t" : "%2d" + "\n", i, i);
        }
    }
    
    /**
     * 打印星期标题
     */
    public static void printWeekTitle() {
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
    }
    
    /**
     * 计算第一天为星期几
     * @param year
     * @param month
     */
    public static int getStartDayWeek(int year, int month) {
        int amountDay = getAmountDay(year, month, START_YERA_1970);
        return (amountDay + START_WEEK_1970) % 7;
    }

    /**
     * 获取从1970到year的总天数
     * @param year
     * @param month
     */
    public static int getAmountDay(int year, int month, int startYear) {
        int amountDay = 0;
        for (int i = startYear; i < year; i++) {
            if (isLeapYear(i)) {
                amountDay += 366;
            } else {
                amountDay += 365;
            }
        }
        for (int m = 1; m < month; m++) {
            amountDay += getMonthDay(year, m);
        }
        return amountDay;
    }

    /**
     * 判断year是否为闰年 
     * 是-Y  否-N
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    /**
     * 计算每个月的天数
     * @param y
     * @param m
     * @return
     */
    public static int getMonthDay(int y, int m) {
        if (m == 1 || m == 3 || m == 5 || m == 7 
                   || m == 8 || m == 10 || m == 12) {
            return 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else {
            return isLeapYear(y) ? 29 : 28;
        }
    }
}
