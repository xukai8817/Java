package com.edu.chapter.four;

import java.util.Scanner;

/**
 * @author xukai
 * @date 2017年2月26日 下午8:50:32
 * 数字金字塔
 *          1
 *      2   1   2    
 *  3   2   1   2    3
 */
public class Exercise4_17 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个在1~15之间的整数：");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            // 空格行
            for (int k = num - i; k > 0; k--) {
                System.out.print("\t");
            }
            // 3 2 1
            for (int j = i; j > 0; j--) {
                System.out.print(j + "\t");
            }
            // 2 3
            for (int k = i - 2; k >= 0; k--) {
                System.out.print(i - k  + "\t");
            }
            System.out.println();
        }
    }

}
