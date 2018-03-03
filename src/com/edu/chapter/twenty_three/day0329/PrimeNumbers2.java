package com.edu.chapter.twenty_three.day0329;

/**
 * @author xukai
 * @date 2017年3月30日 下午3:28:08
 * 复杂度为：n * (n的二分之一次方)
 */
public class PrimeNumbers2 {

    public static void main(String[] args) {
        int rowCount = 1;
        int numbers = 1000;
        int startNumber = 2;
        int sqrtRoot = 1;
        while (numbers >= startNumber) {
            boolean isPrime = true;
            if (sqrtRoot * sqrtRoot < startNumber)
                sqrtRoot++;
            for (int i = 2; i <= sqrtRoot; i++) {
                 if (startNumber % i == 0) {
                     isPrime = false;
                     break;
                 }
            }
            if (isPrime) {
                System.out.printf((rowCount++ % 10) == 0 ? "%3d" + "\n": "%3d" + " ",startNumber,startNumber);
            }
            startNumber++;
        }
    }

}
