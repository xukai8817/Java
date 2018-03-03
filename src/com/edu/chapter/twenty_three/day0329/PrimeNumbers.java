package com.edu.chapter.twenty_three.day0329;

/**
 * @author xukai
 * @date 2017年3月30日 上午11:32:17
 *
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        int rowCount = 1;
        int numbers = 100;
        int startNumber = 2;

        while (numbers >= startNumber) {
            boolean isPrime = true;
            int sqrtRoot = (int) Math.sqrt(startNumber);
            for (int i = 2; i <= sqrtRoot; i++) {
                 if (startNumber % i == 0) {
                     isPrime = false;
                     break;
                 }
            }
            if (isPrime) {
                System.out.printf((rowCount++ % 10) == 0 ? "%2d" + "\n": "%2d" + " ",startNumber,startNumber);
            }
            startNumber++;
        }
    }

}
