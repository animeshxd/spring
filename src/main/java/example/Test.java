package example;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Test {
    List<String> list;
    Map<Integer, String> map;
    Set<String> set;
    
    /**
     * @Aurowire
     * @Qualifier("list")
     * public void setList(List<String> list) {
     *   this.list = list;
     * }
     * This annotation will not work, as It will try to autowire
     * list of String beans which is not Defined
     * 
     * 
     * 
     */
    @Resource()
    public void setList(List<String> list) {
        this.list = list;
    }
    
    @Resource()
    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Resource()
    public void setSet(Set<String> set) {
        this.set = set;
    }


    @Override
    public String toString() {
        return "Test [list=" + list + ", map=" + map + ", set=" + set + "]";
    }
    
}