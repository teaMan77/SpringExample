package com.example.componentScan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        //by default bean with the name 'employee' is created, so using that here.
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());
    }
}
