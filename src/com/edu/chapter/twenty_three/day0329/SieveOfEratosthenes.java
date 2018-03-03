package com.edu.chapter.twenty_three.day0329;

/**
 * @author xukai
 * @date 2017年3月30日 下午7:01:55
 * 复杂度：(n*n的二分之一次方)/(logn)
 */
public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int numbers = 1000;
        int colCount = 1;
        boolean[] primes = new boolean[numbers + 1];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        for (int i = 2; i <=numbers/i; i++) {
            if (primes[i]) {
                for (int j = i; j <= numbers/i; j++) {
                    primes[i*j] = false;
                }
            }
        }
        
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.printf((colCount++ % 10 == 0) ? "%3d" + "\n" : "%3d" + " ", i, i);
            }
        }
        
    }
    
}
