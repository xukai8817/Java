package com.edu.chapter.twenty_two.day0316;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author xukai
 * @date 2017年3月16日 下午3:27:20
 *
 */
public class MapTest {

    public static void main(String[] args) {
        testPut();
    }
    
    public static void testPut() {
        Map<Integer, String> map = new HashMap<>();
        String put = map.put(1, "1");
        System.out.println(map);
        String str = map.put(1, "2");
        System.out.println(map + "," + put + "," + str);
        System.out.println(map.put(2, "3"));
        new LinkedHashMap<>(16, 0.75f, true);
    }
    
}
