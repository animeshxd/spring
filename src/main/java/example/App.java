package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-java
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Test test = context.getBean("test", Test.class);
        test.print();   
    }
}
