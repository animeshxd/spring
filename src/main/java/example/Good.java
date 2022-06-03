package example;

import org.springframework.beans.factory.annotation.Qualifier;
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Good {
    
}
