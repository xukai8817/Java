package com.edu;

/**
 * @author xukai
 * @date 2017年2月27日 下午6:01:23
 * break掉了
 */
public class TestSwitch {

    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                break;
        }
        
    }
    
}
