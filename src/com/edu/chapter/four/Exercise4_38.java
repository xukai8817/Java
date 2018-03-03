package com.edu.chapter.four;

import java.util.Scanner;

/**
 * @author xukai
 * @date 2017年2月27日 下午5:43:18
 *       十进制到十六进制
 */
public class Exercise4_38 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个十进制整数: ");
        int num = input.nextInt();

        int temp = num;
        int value;
        String hexString = "";
        while (temp != 0) {
            value = temp % 16;
            if (value == 15) {
                hexString = "f" + hexString;
            } else if (value == 14) {
                hexString = "e" + hexString;
            } else if (value == 13) {
                hexString = "d" + hexString;
            } else if (value == 12) {
                hexString = "c" + hexString;
            } else if (value == 11) {
                hexString = "b" + hexString;
            } else if (value == 10) {
                hexString = "a" + hexString;
            } else {
                hexString = value + hexString;
            }
            temp = temp / 16;
        }
        System.out.println(hexString);
        String num1 = Integer.toHexString(num);
        System.out.println(num1);
    }
}
