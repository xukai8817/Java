package com.edu.sort;

/**
 * @author xukai
 * @date 2017年3月3日 下午4:14:00
 * 排序<br>
 * 冒泡排序将值放在数列最后，选择排序将值放在最前
 */
public class Sort {

    
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1,0};
        bubble(array);
        selection(array);
        myInsertion(array);
        insertion(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    /**
     * 冒泡排序
     * @param array
     */
    public static void bubble(int[] array) {
        System.out.println("冒泡排序开始：---------------");
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print("第" + (i+1) + "次排序:");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * 选择排序<br>
     * 找到最小数，放在数列最前面，迭代此操作
     * @param array
     */
    public static void selection(int[] array) {
        System.out.println("选择排序开始：---------------");
        int temp = 0;
        // 假设第一数是最小数
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
            System.out.print("第" + (i+1) + "次排序:");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * 插入排序<br>
     * @param array
     */
    public static void myInsertion(int[] array) {
        System.out.println("插入排序开始：---------------");
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (array[i+1] < array[j]) {
                    temp = array[i+1];
                    for (int k = i+1; k > j; k--) {
                        // 向后移动一位
                        array[k] = array[k-1] ;
                    }
                    array[j] = temp;
                }
            }
            System.out.print("第" + (i+1) + "次排序:");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
    
    public static void insertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k;
            for (k = i - 1; k >= 0 && array[k] < currentElement; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }
}
