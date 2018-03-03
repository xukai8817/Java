package com.edu.chapter.twenty_three.day0329;

/**
 * @author xukai
 * @date 2017年3月30日 上午10:48:00
 *
 */
public class GCD2 {

    public static void main(String[] args) {
        System.out.println(getGcd(9, 8));
    }
    
    /**
     * 复杂度为：logn
     * @param m
     * @param n
     * @return
     */
    public static int getGcd(int m, int n) {
        if (m % n == 0) {
            return n;
        } else {
            return getGcd(n, m % n);
        }
    }
    
}
