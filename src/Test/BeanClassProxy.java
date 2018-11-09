import com.kaige123.daomu.service.UserPayService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class BeanClassProxy {

    @Autowired
    private UserPayService userPayService;

    Logger logger = Logger.getLogger(BeanClassProxy.class);

    @Test
    public void BeanClassProxyTest() {
//        如果service产生的是代理类,则表示OK,因为service使用了@Transcational注解
//        这样Spring将对我们的类产生代理,管理事务
        logger.info("userPayService= " + userPayService.getClass().getName());
    }

//        类中需要至少有一个方法,Spring才会产生代理
//        因为Spring管理我们的类,所以能拿到类构造,并产生代理管理事务

}
