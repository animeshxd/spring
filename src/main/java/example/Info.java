package example;


public class Info {

    public String name;
    public int id;
    
    public Info(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public Info(){}

    public void print(){
        System.out.println("name = " + name);
        System.out.println("id   = " + id);
    }
    
}
