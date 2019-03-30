import com.wangyu.domain.Car;
import com.wangyu.domain.Man;
import com.wangyu.domain.MyCollection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 17:10
 * 描述：属性注入的方式
 */
public class Demo1 {

    /**
     * 实例化bean的测试
     */
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Applaction.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);

        System.out.println("-----------------");
        Man man = context.getBean("man", Man.class);
        System.out.println(man);

        MyCollection bean = context.getBean("mycollection", MyCollection.class);
        //复杂属性的注入
        System.out.println(bean.getList());
        System.out.println(bean.getMap());
        System.out.println(bean.getProperties());

        //空值的注入
        System.out.println(bean.getMan());
    }
}
