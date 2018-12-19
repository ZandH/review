package com.soft1841.javaoop.exam;

import java.util.Scanner;

/**
 * 数字分割练习
 * 如88888，分割为88，888
 */
public class NumberSplit {
    public static void main(String[] args) {
        System.out.println("请输入一个数字串");
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        //通过StringBuffer构建可变字符串
        StringBuffer str = new StringBuffer(nums);
        System.out.println("处理前的字符串:");
        System.out.println(str);
        //进行逗号的处理
        for (int i = nums.length();i>0;i=i-3){
            if (i>3) {
                str.insert(i-3, ",");
            }
        }
        System.out.println(str);
    }
}
