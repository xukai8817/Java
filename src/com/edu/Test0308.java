package com.edu;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xukai
 * @date 2017年3月8日 下午5:07:05
 *
 */
public class Test0308 {

    public static <T, E> void main(String[] args) {
        testT(new String("123456789"));
        testT(new Integer(123));
        
        testE(new String("123456789").charAt(0));
        
        List<T> list1 = new ArrayList<T>();
        list1.add((T) "123");
        List<E> list2 = new ArrayList<E>();
        list2.add((E) "123");
        
        Test0308 t = new Test0308();
        t.testE(list2);
        
        MyClass<String> my = new MyClass<String>();
        my.print(new Integer(123));
        MyClass.print(new Integer(456));
        
        AbstractList<String> abstractList = new ArrayList<>();
        abstractList.add("abd");
        System.out.println(abstractList);
        abstractList.set(0, "c");
        System.out.println(abstractList);
        System.out.println(abstractList.toString());
        
        AbstractList list = new TestUnsupportedOperationException<>();
//        list.add("2136");
//        list.set(0, "abd");
        System.out.println(list);
        System.exit(0);
    }
    
    private static <T> void testT(T t) {
        System.out.println(t);
    }
    
    private static <E> void testE(E e){
        System.out.println(e);
    }
    
}
