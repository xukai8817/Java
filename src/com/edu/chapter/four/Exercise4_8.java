package com.edu.chapter.four;

import java.util.Scanner;

/**
 * @author xukai
 * @date 2017年2月25日 下午3:07:39
 *
 */
public class Exercise4_8 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生个数：");
        int num = input.nextInt();
        String name = null;
        int maxGrade = -1;
        for (int i = num; i > 0; i--) {
            System.out.println("请输入学生姓名以及分数：");
            String tempName = input.next();
            int tempGrade = input.nextInt();
            if (tempGrade > maxGrade) {
                name = tempName;
                maxGrade = tempGrade;
            }
        }
        System.out.println(name + "," + maxGrade);
    }

}
