package spring;

import com.wangyu.spring.Bean1;
import com.wangyu.spring.Bean2;
import com.wangyu.spring.Bean2Factory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 16:00
 * 描述：
 */
public class Demo1 {

    /**
     * spring ioc初体验
     * 使用构造方法初始化bean
     */
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Applaction.xml");
        //第二个参数代表的是返回值类型
        Bean1 bean1 =  context.getBean("bean1-1",Bean1.class);
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Applaction.xml");
        Bean2 bean2 = context.getBean("bean2", Bean2.class);
    }


}
