package com.wangyu.car;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 10:36
 * 描述：
 */
public class Aodi implements Car{
    public void start() {
        System.out.println("A开始");
    }

    public void right() {
        System.out.println("A→");
    }

    public void left() {
        System.out.println("A←");
    }

    public void stop() {
        System.out.println("A停止");
    }
}
