package example;

public class RefTest {
    private Info info;

    public RefTest(Info info) {
        this.info = info;
    }
    public void print(){
        System.out.printf("id=%d, name=%s \n", info.getId(), info.getName());
    }

}
