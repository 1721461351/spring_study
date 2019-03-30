import com.wangyu.IocContainer;
import com.wangyu.car.Aodi;
import com.wangyu.car.Baoma;
import com.wangyu.human.Human;
import com.wangyu.human.Xiaohei;
import org.junit.Before;
import org.junit.Test;

/**
 * 作者：王宇
 * 创建时间：2019/3/30 0030 10:34
 * 描述：
 */
public class IocTest {
    private IocContainer iocContainer = new IocContainer();
    @Before
    public void Before(){
        iocContainer.setBean(Baoma.class,"baoma");
        iocContainer.setBean(Aodi.class,"aodi");
        iocContainer.setBean(Xiaohei.class,"xiaohei","aodi");
    }

    @Test
    public void test1(){

        Object baoma = (Baoma) iocContainer.getBean("baoma");
        ((Baoma) baoma).left();
        Human xiaohei = (Human) iocContainer.getBean("xiaohei");
        xiaohei.goHome();
    }
}
