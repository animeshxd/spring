package example;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean{
    List<Integer> list;
    
    public Test(List<Integer> list) {
        System.out.println("constructor called");
        this.list = list;
    }

    void print(){
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
       System.out.println("afterPropertiesSet() called for Test");
        
    }

    @Override
    public void destroy() throws Exception {
        
        System.out.println("destroy() method called for Test");
    }
}
