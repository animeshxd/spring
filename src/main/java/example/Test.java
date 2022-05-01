package example;

public class Test {
    private String what = "default";
    private String test = "constructor";
    private int id = 0;
    
    public Test(int id) {
        this.id = id;
    }
    public Test(String what, String test) {
        this.what = what;
        this.test = test;
    }
    void say() {
        System.out.println(String.format("what %s, test %s, id=%d ", what, test, id));
    }
    public String getWhat() {
        return what;
    }
    
    public void setWhat(String what) {
        this.what = what;
    }
}
