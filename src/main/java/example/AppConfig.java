package example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    
    @Bean("info") // default info1
    public Info info1(){
        return new Info("A", 20);
    }

    @Bean //  info2
    @Primary
    public Info info2(){
        return new Info("B", 21);
    }

    @Bean
    public Test test(){
        return new Test();
    }
}
