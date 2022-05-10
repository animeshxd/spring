package example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(java.lang.Object bean, java.lang.String beanName) throws BeansException {
        System.out.println("before : "+beanName);
        return bean;
    }
    @Override  
    public Object postProcessAfterInitialization(java.lang.Object bean, java.lang.String beanName) throws BeansException {
        System.out.println("after : "+beanName);
        return bean;

    }
}
