package example;

import java.util.List;

public class Test {
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

    
    public void afterPropertiesSet() throws Exception {
       System.out.println("afterPropertiesSet() called for Test");
        
    }

    
    public void destroy() throws Exception {
        
        System.out.println("destroy() method called for Test");
    }
}
