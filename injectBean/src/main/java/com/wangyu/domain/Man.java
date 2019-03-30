package com.wangyu.domain;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 17:13
 * 描述：
 */
public class Man {

    private String name;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
