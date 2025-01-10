package com.kodnest.SpringExample.SpringProject5Wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("config.xml");
     Employee empobj1=(Employee)cxt.getBean("emp1");
     System.out.println(empobj1);
     
     Employee empobj2=(Employee)cxt.getBean("emp2");
     System.out.println(empobj2);
     
     CompanyXYZ cmpobj=(CompanyXYZ)cxt.getBean("cmp");
     System.out.println(cmpobj);
    }
}
