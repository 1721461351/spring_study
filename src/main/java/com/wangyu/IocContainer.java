package com.wangyu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 10:08
 * 描述：手动创建一个loc容器
 * 1.实例化bean
 * 2.提供bean
 * 3.保存bean
 *      快捷键：
 *      在循环的时候，可以把变量名打出来.for
 */
public class IocContainer {
    private Map<String,Object> beans = new ConcurrentHashMap<String, Object>();

    /***
     * 根据beanId获取bean
     * @param beanId
     * @return
     */
    public Object getBean(String beanId){
        return beans.get(beanId);
    }

    public void setBean(Class<?> clazz, String beanId, String ... paramBeanIds){
        //初始化一个value数组
        Object[] paramValues = new Object[paramBeanIds.length];
        //给每个paramValues赋值
        for (int i = 0; i < paramValues.length; i++) {
            paramValues[i] = beans.get(paramBeanIds[i]);
        }
        //调用构造方法实例化bean
        for (Constructor<?> constructor : clazz.getConstructors()) {
            Object bean = null;
            try {
                bean= constructor.newInstance(paramValues);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
            if (bean == null){
                throw new RuntimeException("实例化bean失败");
            }
            //把bean放入容器中
            beans.put(beanId,bean);
        }

    }
}
