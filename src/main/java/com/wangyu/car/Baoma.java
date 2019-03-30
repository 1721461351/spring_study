package com.wangyu.car;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 10:33
 * 描述：
 */
public class Baoma implements Car{
    public void start() {
        System.out.println("开始");
    }

    public void right() {
        System.out.println("→");
    }

    public void left() {
        System.out.println("←");
    }

    public void stop() {
        System.out.println("停止");
    }
}
