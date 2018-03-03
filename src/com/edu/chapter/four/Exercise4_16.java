package com.edu.chapter.four;

import java.util.Scanner;

/**
 * @author xukai
 * @date 2017年2月25日 下午5:43:18
 * 找出一个整数的因子
 */
public class Exercise4_16 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int num = input.nextInt();
//        for(int i = 2; i < num; i++) {
//            if(num % i == 0) {
//                num = num / i;
//                System.out.print(i + " ");
//            }
//        }
        
        int n = 2;
        while(num != 1) {
            if (num % n == 0) {
                System.out.print(n + " ");
                num = num / n;
            } else {
                n ++;
            }
        }
    }

}
