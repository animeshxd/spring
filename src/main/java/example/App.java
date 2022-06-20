package example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ctx.registerShutdownHook();
        Test info = ctx.getBean("do", Test.class);
        info.print();
    }
}
