package com.edu.chapter.twenty_two.day0316;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author xukai
 * @date 2017年3月16日 上午11:22:16
 *
 */
public class CollectionsTest {

    public static void main(String[] args) {
//        testCopy();
        testFill();
    }
    
    public static void testCopy() {
        List<String> list1 = Arrays.asList("a","b","c","d");
        List<String> list2 = Arrays.asList("e","f","g","h");
        Collections.copy(list2, list1);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.get(0)== list2.get(0));
    }
  
    public static void testFill() {
        List<String> list1 = Arrays.asList("a","b","c","d");
        Collections.fill(list1, "f");
        System.out.println(list1);
    }
}
