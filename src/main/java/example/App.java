package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        // Test test = (Test) ctx.getBean("test");
        // test.say();

        // RefTest tst = (RefTest) ctx.getBean("reftest");
        // tst.print();
        // RefTest tst1 = (RefTest) ctx.getBean("reftest");
        // tst1.print();

        Aware aware = (Aware) ctx.getBean("aware");
        aware.print();
        aware.printInfo();
    }
}
