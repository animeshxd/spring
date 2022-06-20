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

    @Resource // type -> name -> primary
    public void setInfo(Info info) {
        this.info = info;
    }

}
