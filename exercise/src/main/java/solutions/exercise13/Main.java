package solutions.exercise13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import solutions.exercise13.beans.SimpleBean;
import solutions.exercise13.beans.SimpleBean2;
import solutions.exercise13.beans.SimpleBean4;
import solutions.exercise13.configuration.BeanFactory;

import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = {"solutions.exercise13.beans","solutions.exercise13.configuration"})
public class Main {

    public static void main(String[] args){
        /*ApplicationContext context =
                new ClassPathXmlApplicationContext("/exercise13/beans.xml");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(s -> {System.out.println(s);});*/

        /*ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(s -> {System.out.println(s);});

        SimpleBean bean = (SimpleBean) context.getBean("simpleBean");
        //...
        */

        /*ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(s -> {System.out.println(s);});

        Object bean2 = context.getBean("objectBeanPrototype");
        Object bean3 = context.getBean("objectBeanPrototype");
        System.out.println("prototype: "+bean2+" <-> "+bean3);
        bean2 = context.getBean("objectBeanSingleton");
        bean3 = context.getBean("objectBeanSingleton");
        System.out.println("singleton: "+bean2+" <-> "+bean3);*/

        /*ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        SimpleBean2 bean2 = (SimpleBean2) context.getBean("simpleBean2");
        Object singletonBean = context.getBean("objectBeanSingleton");

        System.out.println("singleton: "+singletonBean+" <-> "+bean2.getObjectBeanSingleton());
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        SimpleBean4 bean = (SimpleBean4) context.getBean("simpleBean4");

        System.out.println("singleton: "+bean.getName());

    }

}
