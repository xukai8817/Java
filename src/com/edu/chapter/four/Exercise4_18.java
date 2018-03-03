package com.edu.chapter.four;


/**
 * @author xukai
 * @date 2017年2月27日 下午4:21:21
 *
 */
public class Exercise4_18 {

    public static void main(String[] args) {
        
        /**
         * 
            1    
            1 2     
            1 2 3   
            1 2 3 4     
            1 2 3 4 5   
            1 2 3 4 5 6
         */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\t");
        }
        
        System.out.println("----分割线----");
        
        /**
         * 
            1 2 3 4 5 6     
            1 2 3 4 5   
            1 2 3 4     
            1 2 3   
            1 2     
            1   
         */
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <= 7 -i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\t");
        }
  
        /**
         * 
                                1       
                            2   1       
                        3   2   1       
                    4   3   2   1       
                5   4   3   2   1       
            6   5   4   3   2   1       
         */
        for (int i = 1; i <= 6; i++) {
            for (int j = 6-i; j > 0; j-- ) {
                System.out.print("\t");
            }
            
            for (int j = i; j > 0; j--) {
                System.out.print(j + "\t");
            }
            System.out.println("\t");
        }
        
        /**
         * 
            1   2   3   4   5   6       
                1   2   3   4   5       
                    1   2   3   4       
                        1   2   3       
                            1   2       
                                1              
         */
        for (int i = 1; i <= 6; i++) {
            for (int j = i - 1; j > 0; j-- ) {
                System.out.print("\t");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println("\t");
        }
    }

}
