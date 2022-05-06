package example;

import org.springframework.beans.factory.BeanNameAware;

public class Aware implements BeanNameAware{
    String beanName;

    @Override
    public void setBeanName(String beanName) {
    //    System.out.println("id of this bean is: "+beanName);
       this.beanName = beanName;
    }
    public void print(){
        System.out.println("My id is : "+beanName);
    }
    
}