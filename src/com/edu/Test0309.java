package com.edu;

import java.util.Arrays;
import java.util.List;

/**
 * @author xukai
 * @date 2017年3月9日 下午6:39:55
 * Collections.binarySearch
 */
public class Test0309 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,7,10,11,45,50,59,60,66);
        System.out.println("get 9: " + indexedBinarySearch(list, 9));
        
        testType();
        testRight();
        testLeft();
        testNot();
    }
    
    private static <T>
    int indexedBinarySearch(List<? extends Comparable<? super T>> list, T key) {
        int low = 0;
        int high = list.size()-1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Comparable<? super T> midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found
    }
    
    public static void testType() {
        byte b = 0;
        char c = (int)0;
        short s = 0;
        int i = 0;
        long l = 0;
        System.out.println("byte-0: " + (b >> 2));
        System.out.println("char-0: " + (c >> 2));
        System.out.println("short-0: " + (s >> 2));
        System.out.println("int-0: " + (i >> 2));
        System.out.println("long-0: " + (l >> 2));
    }
    
    public static void testRight() {
        System.out.println((int)15 >> 1);
        System.out.println((int)15 >> 2);
        System.out.println((int)-15 >> 1);
        System.out.println((int)-15 >> 2);
        System.out.println((int)-15 / 2);
    }
    
    
    
    public static void testLeft() {
        System.out.println((int)15 << 1);
        System.out.println((int)15 << 2);
        System.out.println((int)-15 << 1);
    }
    
    public static void testNot() {
        System.out.println((int)7 >>> 1);
        System.out.println((int)-7 >>> 1);
        System.out.println((int)-1 >>> 1);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
