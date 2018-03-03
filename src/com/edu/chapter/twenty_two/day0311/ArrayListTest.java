package com.edu.chapter.twenty_two.day0311;

import java.util.ArrayList;

/**
 * @author xukai
 * @date 2017年3月11日 上午11:36:27
 *
 */
public class ArrayListTest {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("old list.size():" + list.size());
        list.trimToSize();
        System.out.println("new list.size():" + list.size());
        
        ArrayList<Integer> list2 = new ArrayList<>(list);
        list2.remove(1);
        System.out.println("old list2.size():" + list2.size());
        list.trimToSize();
        System.out.println("new list2.size():" + list2.size());
        System.out.println(list2);
    }
    
}
