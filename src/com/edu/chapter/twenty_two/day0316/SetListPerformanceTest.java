package com.edu.chapter.twenty_two.day0316;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author xukai
 * @date 2017年3月16日 上午11:34:29
 * 规则集和线性表性能:
 * 规则集比线性表更加高效
 * 在线性表中，除了在结尾处添加和删除，链式线性表比数组线性表更加高效
 */
public class SetListPerformanceTest {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        System.out.println("hashSet:" + getTestTime(hashSet, 500000));
        
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        System.out.println("linkedHashSet :" + getTestTime(linkedHashSet, 500000));
        
        Set<Integer> treeSet = new TreeSet<>();
        System.out.println("treeSet: " + getTestTime(treeSet, 500000));
        
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("arrayList: " + getTestTime(arrayList, 60000));
        
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("linkedList: " + getTestTime(linkedList, 60000));
        
    }
    
    public static long getTestTime(Collection<Integer> c, int size) {
        long startTime = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (Integer integer : list) {
            c.add(integer);
        }
        Collections.shuffle(list);
        for (Integer integer : list) {
            c.remove(integer);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
