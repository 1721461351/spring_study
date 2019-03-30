package com.wangyu.domain;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 17:45
 * 描述：
 */
public class MyCollection {

    private List<String> list;

    private Map<Integer, String> map;

    private Properties properties;

    @Override
    public String toString() {
        return "MyCollection{" +
                "list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                ", man=" + man +
                '}';
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    private Man man;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public MyCollection(){

    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

}
