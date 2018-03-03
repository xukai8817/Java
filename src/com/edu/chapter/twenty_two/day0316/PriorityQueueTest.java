package com.edu.chapter.twenty_two.day0316;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author xukai
 * @date 2017年3月16日 下午12:08:08
 *
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();// 初始大小为11
        priorityQueue.add("aa");
        priorityQueue.add("bb");
        priorityQueue.add("cc");
        while (priorityQueue.size() > 0) {
            System.out.print(priorityQueue.remove() + " ");
        }
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>(4, Collections.reverseOrder());// 初始大小为4
        priorityQueue2.add("aa");
        priorityQueue2.add("bb");
        priorityQueue2.add("cc");
        while (priorityQueue2.size() > 0) {
            System.out.print(priorityQueue2.remove() + " ");
        }
        
        
    }
    
}
