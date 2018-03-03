package com.edu.chapter.twenty_two.day0316;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xukai
 * @date 2017年3月16日 下午12:03:13
 *
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("aaa");
        queue.offer("bbb");
        queue.offer("ccc");
        queue.offer("ddd");
        
        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }
    }
    
}
