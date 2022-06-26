package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-java
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Info info = context.getBean("info", Info.class);
        info.print();

        Info info2 = context.getBean("info2", Info.class);
        info2.print();
    }
}
