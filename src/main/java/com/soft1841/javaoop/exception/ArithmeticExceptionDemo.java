package com.soft1841.javaoop.exception;

/**
 * 算术异常练习
 */
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int n = 3;
        try {
            System.out.println(n / 0);
        }catch (ArithmeticException e){
            //粗暴处理异常
            e.printStackTrace();
            //友好处理
            System.err.println("除数不能为0！！");
        }
    }
}
