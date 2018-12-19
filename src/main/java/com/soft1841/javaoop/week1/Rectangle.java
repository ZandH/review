package com.soft1841.javaoop.week1;

public class Rectangle extends Shape{
    @Override
    public void getArea() {
        super.getArea();
        int width = 10;
        int height = 5;
        System.out.print(width*height);
    }
}
