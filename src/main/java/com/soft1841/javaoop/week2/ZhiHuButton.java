package com.soft1841.javaoop.week2;
import javafx.scene.control.Button;
public class ZhiHuButton extends Button {
    public ZhiHuButton () {
        //给当前按钮设置合适的尺寸
        this.setPrefSize(100, 30);
        //设置当前按钮背景色
        this.setStyle("-fx-background-color: rgb(130,194,217);-fx-font-size: 14px;-fx-text-fill: #FFFFFF");

    }
}
