package com.wangyu.domain;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 16:57
 * 描述：
 */
public class Car {

    private String color;
    private String name;

//    public Car(){
//
//    }
    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
