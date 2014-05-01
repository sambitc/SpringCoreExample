package com.mkyong.core;

import com.mkyong.common.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mkyong.config.AppConfig;
import com.mkyong.hello.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // EX - 1
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");

        obj.printHelloWorld("Spring3 Java Config");

        // EX - 2
        context =
                new ClassPathXmlApplicationContext(new String[]{"Spring-Customer.xml"});

        Customer cust = (Customer) context.getBean("CustomerBean");
        System.out.println(cust);

        // EX - 3
        // Before running check "toString" method.
        cust = (Customer) context.getBean("CustomerBean1");
        System.out.println(cust.getLists());

        // EX - 4
        context = new ClassPathXmlApplicationContext("Spring-Customer.xml");

        com.mkyong.core.Customer cobj = (com.mkyong.core.Customer) context.getBean("customerBean2");
        System.out.println("--" + cobj.getItemName());
        System.out.println("--" + cobj.getItem().getName());
    
}
}