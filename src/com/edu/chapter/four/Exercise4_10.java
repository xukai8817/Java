package com.edu.chapter.four;

/**
 * @author xukai
 * @date 2017年2月25日 下午3:31:52
 *
 */
public class Exercise4_10 {

    public static void main(String[] args) {
        int num = 0;
        for (int i = 120; i <= 1000; i++) {
            if(i % 5 == 0 && i % 6 == 0) {
                num ++;
                if (num % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + "\t");
                }
            }
        }
        
        int count = 1;
        for (int i = 120; i <= 1000; i++)
          if (i % 5 == 0 && i % 6 == 0)
            System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");
    }

}
