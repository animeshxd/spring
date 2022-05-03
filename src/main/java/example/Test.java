package example;

import java.util.List;

public class Test {
    private String what = "default";
    private String test = "constructor";
    private int id = 0;
    private List<Integer> list;
    
    public Test(String what) {
        this.what = what;
    }
    public List<Integer> getList() {
        return list;
    }
    public void setList(List<Integer> list) {
        this.list = list;
    }
    public Test(int id) {
        this.id = id;
    }
    public Test(String what, String test) {
        this.what = what;
        this.test = test;
    }
    void say() {
        System.out.println(String.format("what=%s, test=%s, id=%d ", what, test, id));
        for (int l: list) {
            System.out.println(l);
        }
    }
    public String getWhat() {
        return what;
    }
    
    public void setWhat(String what) {
        this.what = what;
    }
}
