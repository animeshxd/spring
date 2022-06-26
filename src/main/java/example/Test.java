package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("test1")
public class Test {

    @Autowired // will select first Info type bean (info) as primary;
    public Info info;

    public void print(){
        info.print();
    }
}
