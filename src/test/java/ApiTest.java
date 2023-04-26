import bean.UserService;
import org.example.bean.BeanDefinition;
import org.example.bean.BeanFactory;
import org.junit.Test;

public class ApiTest {
    @Test
    public void testBeanFactory() {
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
