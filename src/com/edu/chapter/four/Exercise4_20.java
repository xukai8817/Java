package com.edu.chapter.four;



/**
 * @author xukai
 * @date 2017年2月27日 下午4:40:19
 * 打印[2,1000]之间的素数，每行8个 
 */
public class Exercise4_20 {

    public static void main(String[] args) {
        int count = 1;
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print((count++) % 8 != 0 ? i + "\t" : i + "\n");
            }
        }
        
    }

}
