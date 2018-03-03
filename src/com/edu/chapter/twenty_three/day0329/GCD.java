package com.edu.chapter.twenty_three.day0329;

/**
 * @author xukai
 * @date 2017年3月29日 下午9:52:06
 *
 */
public class GCD {

    public static void main(String[] args) {
        System.out.println(getGCD(20,10));
        System.out.println(getGCD(20,8));
    }
    
    /**
     * 复杂度为n
     * @param m
     * @param n
     * @return
     */
    public static int getGCD(int m, int n) {
        if (m % n == 0)
            return n;
        int gcd = 1;
        for (int i = n / 2; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
    
}
