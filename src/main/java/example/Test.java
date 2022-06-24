package example;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
                                      // uses src/main/java/data.properties if src\main\resources\data.properties does not exists 
@PropertySource("data.properties")    //  java/data.properties gets overridden by resources\data.properties
public class Test {                   //  it will use java/data.properties if it more data than resources\data.properties
    
    public Test () {
       System.out.println("Constructor gets called");
    }
    // Auto wireing env using @PropertySource
    @Autowired
    Environment env;

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

    // @Value("#{ systemProperties['os.name'] }")
    @Value("${os.name}")
    public String os;

    //@Value("#{ systemEnvironment['NUMBER_OF_PROCESSORS'] }")
    @Value("${NUMBER_OF_PROCESSORS}")
    public String processor;

    @Value("${UNKNOWN:Default Value}")
    public String unknownenv;

    @Value("${data}")
    public String propertieString; // from data.properties file data=

    public void print(){
        System.out.println(", value           = " + value);
        System.out.println(", list            = " + list);
        System.out.println(", map             = " + map);
        System.out.println(", value2          = " + value2);
        System.out.println(", set             = " + set);
        System.out.println(", os              = " + os);
        System.out.println(", processor       = " + processor);
        System.out.println(", unknownenv      = " + unknownenv);
        System.out.println(", propertieString = " + propertieString);
        System.out.println(", propertieString = " + env.getProperty("data"));


    }

    
}
