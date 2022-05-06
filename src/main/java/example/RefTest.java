package example;

public class RefTest {
    private Info info;

    public RefTest(Info info) {
        this.info = info;
    }
    /**
     * Fix for "No default constructor found"
     *  (We need to explicitly define no args constructor for autowire="byName")
     * */
    public RefTest(){
        System.out.println("Constructor called");
    } 
    public void print(){
        System.out.printf("id=%d, name=%s \n", info.getId(), info.getName());
    }
    public Info getInfo() {
        return info;
    }
    public void setInfo(Info info) {
        this.info = info;
    }

}
