package example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("do")
// default bean id "test"
public class Test {

    Info info;

    void print() {
        info.print();
    }

    public Info getInfo() {
        return info;
    }

    @Resource() // type -> name -> primary
    // default name "info"
    public void setInfo(Info info) {
        this.info = info;
    }

    @PostConstruct
    public void init(){
        System.out.println("init() called for Test");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy() called for Test");

    }

}
