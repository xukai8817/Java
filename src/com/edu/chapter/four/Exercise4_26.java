package com.edu.chapter.four;

/**
 * @author xukai
 * @date 2017年2月27日 下午4:54:15
 *       计算e = 1 + 1/1! + 1/2! + ... + 1/i!
 */
public class Exercise4_26 {

    public static void main(String[] args) {
        double e = 1.0;
        for (int i = 10000; i <= 100000; i += 10000) {
            double item = 1.0;
            // 循环次数 newitem = item / i
            for (int j = 1; j < i + 1; j++) {
                item = item / j;
                e += item;
            }
            System.out.println("i=" + i + ",e=" + e);
        }
        
        double e1 = 1;
        double item = 1;

        for (int i = 1; i <= 100000; i++) {
          item = item / i;
          e1 += item;

          if (i == 10000 || i == 20000 || i == 30000 || i == 40000 ||
              i == 50000 || i == 60000 || i == 70000 || i == 80000 ||
              i == 90000 || i == 100000)
          System.out.println("The e is " + e1 + " for i = " + i);
        }
    }

}
