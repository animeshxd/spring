package example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ctx.registerShutdownHook();
        // Info info1 = (Info) ctx.getBean("info1");
        // info1.print();

        // Info info2 = (Info) ctx.getBean("info2");
        // info2.print();

        Test test = (Test) ctx.getBean("test");
        test.print();
    }
}
