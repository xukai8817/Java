package com.edu.chapter.four;


/**
 * @author xukai
 * @date 2017年2月25日 下午3:39:38
 * 求满足n*n > 12000的n的最小值，要求使用while循环
 */
public class Exercise4_12 {

    public static void main(String[] args) {
        int n = 1000;
        while(n * n > 12000) {
            n--;
        }
        System.out.println(n+1);
        
        int i = 1;
        while (i * i <= 12000 ) {
          i++;
        }
        System.out.println("This number is " + i);
    }

}
