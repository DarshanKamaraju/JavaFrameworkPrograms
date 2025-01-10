package com.kodnest.SpringExample.SpringProject7Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("config.xml");
        Engine engobj1=(Engine)cxt.getBean("en");
        System.out.println(engobj1);
     
        Car carobj=(Car)cxt.getBean("cr");
        System.out.println(carobj);
    }
}
