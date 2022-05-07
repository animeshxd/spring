package example;

public class Info {
    public int id;
    public String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void print(){
        System.out.printf("id=%d, name=%s\n", id, name);
    }
    
}
