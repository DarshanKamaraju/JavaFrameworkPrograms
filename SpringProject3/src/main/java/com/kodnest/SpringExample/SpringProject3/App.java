package com.kodnest.SpringExample.SpringProject3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cxt =new ClassPathXmlApplicationContext("config.xml");
    	Laptop lap1=(Laptop)cxt.getBean("lapbean1");
    	Laptop lap2=(Laptop)cxt.getBean("lapbean2"); 
    	
        System.out.println(lap1);
        System.out.println(lap2);
    }
}
