package com.edu.chapter.four;

/**
 * @author xukai
 * @date 2017年2月25日 下午5:37:13
 * 打印ASCLL字符表从'!'到'~'
 */
public class Exercise4_14 {

    public static void main(String[] args) {
        int count = 1;
        for(int i = (int)'!'; i <= (int)'~'; i++) {
            System.out.print((count++) % 10 != 0 ? (char)i  + " ": (char)i + "\n");
        }
        System.exit(0);
    }

}
