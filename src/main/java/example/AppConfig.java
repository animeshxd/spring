package example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean("info") // default info1
    public Info info1(){
        return new Info("A", 20);
    }

    @Bean //  info2
    public Info info2(){
        return new Info("B", 21);
    }
}
