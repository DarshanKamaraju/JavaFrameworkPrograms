package com.kodnest.SpringExample.SpringProject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
    	JavaTeacher obj1=(JavaTeacher)ctx.getBean("jt");
        System.out.println(obj1);
        
       
    	PythonTeacher  obj2=(PythonTeacher)ctx.getBean("pt");
        System.out.println(obj2);
        
    	SQLTeacher obj3=(SQLTeacher)ctx.getBean("st");
        System.out.println(obj3);
    	ctx.close();
    }
}
