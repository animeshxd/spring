package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Test test = (Test) context.getBean("test");
        test.print();
        
        context.getBean("test");
        context.getBean("test");
    }
}
