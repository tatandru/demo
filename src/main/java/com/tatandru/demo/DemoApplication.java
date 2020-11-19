package com.tatandru.demo;

import com.tatandru.demo.controller.ConstructorInjectedController;
import com.tatandru.demo.controller.MyController;
import com.tatandru.demo.controller.PropertyInjectedController;
import com.tatandru.demo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");
        controller.hello();
        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }

}
