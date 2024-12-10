package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MrBean mrBean = (MrBean) context.getBean("mrBean");
        mrBean.showMessage();
        System.out.println(mrBean);
    }
}
