package com.edu;

/**
 * @author xukai
 * @date 2017年3月8日 下午5:41:41
 * 在静态环境下不允许类的参数是泛型类型
 */
public class MyClass<T> {

    public int a = 0;
    
    public T t;
    
    public static <T> void print(T t){
        System.out.println(t);
    }
    
}
