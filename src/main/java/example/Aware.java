package example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Aware implements BeanNameAware, ApplicationContextAware{
    String beanName;
    ApplicationContext context;

    @Override
    public void setBeanName(String beanName) {
    //    System.out.println("id of this bean is: "+beanName);
       this.beanName = beanName;
    }
    public void print(){
        System.out.println("My id is : "+beanName);
    }

    public void printInfo(){
        if(context == null) return;
        Info info = (Info) context.getBean("info");
        System.out.printf("id=%d, name=%s \n", info.getId(), info.getName());
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
    
}