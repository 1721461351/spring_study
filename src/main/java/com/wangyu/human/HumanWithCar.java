package com.wangyu.human;

import com.wangyu.car.Car;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 10:03
 * 描述：
 */
public abstract class HumanWithCar implements Human{
    protected Car car;
    public abstract void goHome();

    public HumanWithCar(Car car) {
        this.car = car;
    }
}
