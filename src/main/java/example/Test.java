package example;

import java.util.List;

public class Test {
    List<Integer> list;
    
    public Test(List<Integer> list) {
        this.list = list;
    }

    void print(){
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
