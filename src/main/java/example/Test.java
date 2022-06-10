package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {

    Info info;

    void print() {
        info.print();
    }

    public Info getInfo() {
        return info;
    }

    @Autowired()
    public void setInfo(Info info) {
        this.info = info;
    }

}
