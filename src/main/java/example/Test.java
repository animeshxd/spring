package example;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {
    
    // https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#expressions
    @Value("StringValue")
    public String value;

    @Value("#{list}")
    public List<String> list;

    @Value("#{map}")
    public Map<Integer, String> map;

    @Value("#{map['2']}") // @Value("#{map[2]}") will not work
    public String value2;

    @Value("#{set}")
    public Set<String> set;

    @Value("#{ systemProperties['os.name'] }")
    public String os;

    //@Value("#{ systemEnvironment['NUMBER_OF_PROCESSORS'] }")
    @Value("${NUMBER_OF_PROCESSORS}")
    public String processor;

    @Value("${UNKNOWN:Default Value}")
    public String unknownenv;


    @Override
    public String toString() {
        return "Test [list=" + list + ", map=" + map + ", os=" + os + ", processor=" + processor + ", set=" + set
                + ", unknownenv=" + unknownenv + ", value=" + value + ", value2=" + value2 + "]";
    }
    
}