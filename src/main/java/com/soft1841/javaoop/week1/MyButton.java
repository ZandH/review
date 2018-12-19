package com.soft1841.javaoop.week1;

import javafx.scene.control.Button;

/**
 * 自定义按钮
 */

public class MyButton extends Button {
    //自定义构造方法，实现一个指定宽和高背景色
    public MyButton(){
        //
        this.setPrefSize(100,30);
        this.setStyle("-fx-background-color: rgb(23,5,46)");

    }
}
