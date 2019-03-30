package com.wangyu.human;

import com.wangyu.car.Car;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 10:05
 * 描述：
 */
public class Xiaohei extends HumanWithCar{
    public Xiaohei(Car car) {
        super(car);
    }

    public void goHome() {
        car.left();
        car.right();
        car.stop();
    }
}
