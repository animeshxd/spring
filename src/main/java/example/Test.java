package example;

public class Test {
    private String what = "default";

    void say() {
        System.out.println(what);
    }
    public String getWhat() {
        return what;
    }
    public void setWhat(String what) {
        this.what = what;
    }
}
