package com.edu.chapter.twenty_three.day0329;

/**
 * @author xukai
 * @date 2017年3月29日 下午5:43:17
 * 斐波那契数列：
 * 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 
 * 0 1 2 3 4 5 6 7  8  9  10 11 12  13  14  15  16  17   18   19
 */
public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(getNumberByIndex(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(improveGetNumberByIndex(i) + " ");
        }
    }

    /**
     * 复杂度为：2ⁿ
     * T(n)  = T(n-1) + T(n-2) + c
     *      <= 2T(n-1) + c
     *      <= 2(2T(n-2)) + c
     *       =  2²T(n-2) + 3c
     * @param index 数列下标
     * @return  该下标的数
     */
    public static long getNumberByIndex(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return getNumberByIndex(index - 1) + getNumberByIndex(index - 2);
        }
    }
    
    /**
     * 复杂度为：n
     * @param index
     * @return
     */
    public static long improveGetNumberByIndex(int index) {
        long f0 = 0;
        long f1 = 1;
        long f2 = 1;
        if (index == 0) {
            return f0;
        } else if (index == 1) {
            return f1;
        }
        for (int i = 3; i <= index; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f1 + f0;
        }
        return f2;
    }
    
}
