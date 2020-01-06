package solutions.exercise13;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import solutions.exercise13.beans.SimpleBean;
import solutions.exercise13.beans.SimpleBean3;
import solutions.exercise13.beans.SimpleBean4;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"solutions.exercise13.beans","solutions.exercise13.configuration"})
public class MainBoot{
    public static void main(String[] args){
        SpringApplication.run(MainBoot.class, args);
    }

    @Bean
    @Profile("default")
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            /*System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

            SimpleBean3 bean = (SimpleBean3) ctx.getBean("simpleBean3");
            System.out.println(bean.getName());

            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            SimpleBean4 bean = (SimpleBean4) ctx.getBean("simpleBean4");
            System.out.println("bean4: "+bean.getName());
        };
    }

    @Bean
    @Profile("lecture")
    public CommandLineRunner commandLineRunner2(ApplicationContext ctx) {
        return args -> {
            SimpleBean4 bean = (SimpleBean4) ctx.getBean("simpleBean4");
            System.out.println("bean4: "+bean.getName());
        };
    }
}
