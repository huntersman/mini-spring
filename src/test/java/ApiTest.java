import bean.UserService;
import org.example.beans.factory.config.BeanDefinition;
import org.example.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class ApiTest {
    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService singleton_userService = (UserService) beanFactory.getBean("userService");
        singleton_userService.queryUserInfo();
    }
}
