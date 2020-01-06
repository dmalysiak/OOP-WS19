package solutions.exercise13.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    //@Scope("prototype")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Object objectBeanPrototype(){
        return new Object();
    }

    @Bean
    @Scope("singleton")
    @Qualifier("objectBeanSingleton")
    public Object objectBeanSingleton(){
        return new Object();
    }
}
