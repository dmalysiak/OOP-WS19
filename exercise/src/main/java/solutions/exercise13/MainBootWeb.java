package solutions.exercise13;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import solutions.exercise13.beans.SimpleBean4;

@ComponentScan(basePackages = {"solutions.exercise13.beans","solutions.exercise13.configuration","solutions.exercise13.web"})
@SpringBootApplication
@EnableWebMvc
public class MainBootWeb {
    public static void main(String[] args){
        SpringApplication.run(MainBootWeb.class, args);
    }
}
