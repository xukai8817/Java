package com.edu.chapter.four;


/**
 * @author xukai
 * @date 2017年2月27日 下午4:47:39
 * 
 */
public class Exercise4_24 {

    public static void main(String[] args) {
        
        double total = 0.0;
        for (int i = 1; i < 98; i += 2) {
            total += i / (i + 2.0);
        }
        System.out.println(total);
        
        double sum = 0;
        for (int i = 1; i <= 97; i += 2)
          sum += 1.0 * i / (i + 2);

        System.out.println(sum);
    }

}
