 package com.kodnest.SpringExample.SpringProject6Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("config.xml");
        Engine engobj1=(Engine)cxt.getBean("eng");
        System.out.println(engobj1);
        
        Engine engobj2=(Engine)cxt.getBean("eng1");
        System.out.println(engobj2);
        
        Car carobj2=(Car)cxt.getBean("cr");
        System.out.println(carobj2);
      
    }
}
