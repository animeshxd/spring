package example;

import javax.annotation.Resource;

public class Test {

    Info info;

    void print() {
        info.print();
    }

    public Info getInfo() {
        return info;
    }

    @Resource(name = "person1") // type -> name -> primary
    // default name "info"
    public void setInfo(Info info) {
        this.info = info;
    }

}
