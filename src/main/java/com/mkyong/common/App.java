package com.mkyong.common;

import com.mkyong.output.IOutputGenerator;
import com.mkyong.output.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // Ex -1 
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "Spring-Module.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();

        // Ex -2
        context = new ClassPathXmlApplicationContext(new String[]{"Spring-Common.xml"});

        OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
        output.generateOutput();

        // EX - 3
        context = new ClassPathXmlApplicationContext("Spring-Customer.xml");

        Customer cust = (Customer) context.getBean("CustomerBean1");
        System.out.println(cust);
    }
}