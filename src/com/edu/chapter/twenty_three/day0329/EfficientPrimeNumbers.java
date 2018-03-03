package com.edu.chapter.twenty_three.day0329;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xukai
 * @date 2017年3月30日 下午3:27:54
 * 复杂度：(n*n的二分之一次方)/(logn)
 */
public class EfficientPrimeNumbers {

    public static void main(String[] args) {
        int numbers = 1000;
        int colCount = 1;
        int startNumber = 2;
        int sqrtRoot = 1;
        List<Integer> primeNumberList = new ArrayList<Integer>(); // 素数集合
        while (startNumber <= numbers) {
            boolean isPrime = true;
            if (sqrtRoot * sqrtRoot < startNumber)
                sqrtRoot++;
            for (int i = 0; i <= sqrtRoot && i < primeNumberList.size(); i++) {
                if (startNumber % primeNumberList.get(i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumberList.add(startNumber);
            }
            startNumber++;
        }
        for (Integer integer : primeNumberList) {
            System.out.printf((colCount++ % 10 == 0) ? "%3d" + "\n" : "%3d" + " ",
                integer, integer);
        }
    }

}
