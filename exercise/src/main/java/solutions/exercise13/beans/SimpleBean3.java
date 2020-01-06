package solutions.exercise13.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("simple-bean-3")
@Getter
@Setter
public class SimpleBean3 {
    private String name;
}
