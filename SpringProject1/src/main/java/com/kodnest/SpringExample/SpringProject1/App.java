package com.kodnest.SpringExample.SpringProject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
    	Student stobj=(Student)ctx.getBean("st");
        System.out.println(stobj);
    }
}
