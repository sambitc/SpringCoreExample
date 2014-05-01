/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sambitc
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[]{"Spring-Aop.xml"});

        CustomerService cust =
                (CustomerService) appContext.getBean("customerServiceProxy");

        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");
        try {
            cust.printThrowException();
        } catch (Exception e) {
        }

    }
}
