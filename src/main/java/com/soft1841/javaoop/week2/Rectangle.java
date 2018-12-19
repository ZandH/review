package com.soft1841.javaoop.week2;


public class Rectangle extends Shape {
    public Rectangle() {
        super();
    }

    public Rectangle(double x, double y) {
        //在构造方法中给父类属性x和y初始化，通过super.x和super.y访问父类属性
        super.x = x;
        super.y = y;
    }

        //重写父类中的的抽象方法getArea()，求出具体形状的面积
        @Override
        public double getArea() {
        //this.x和 this.y是访问当前对象的x和y属性，此处用super.x*super.y也可以
        return this.x * this.y;
    }
}

