package com.kodnest.hibernate2.hiberanateCRUDoperationProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//create();
    	//fetchData();
    	//update();
    	delete();
    	
    }
    public static void create()
    {
    	   Configuration cfg=new Configuration();
	       cfg.configure();
	       SessionFactory factory=cfg.buildSessionFactory();
	       Session session=factory.openSession();
	       Transaction tr= session.beginTransaction();
	       
	       Person per1= new Person(11,"Sumit",25,"Sumit@gmail.com",987654321L);
	       Person per2= new Person(12,"Sumathi",26,"Sumathi@gmail.com",987245635L);

	       session.save(per1);
	       session.save(per2);
	       tr.commit();
	       
	       
    }
    public static void fetchData()
    {
    	 Configuration cfg=new Configuration();
	       cfg.configure();
	       SessionFactory factory=cfg.buildSessionFactory();
	       Session session=factory.openSession();
	       Transaction tr= session.beginTransaction();
	       //Fetch the person object
	       Person pr=session.get(Person.class,12);
	       System.out.println(pr);
	       
	       tr.commit();
    }
    public static void update()
    {
    	Configuration cfg=new Configuration();
	       cfg.configure();
	       SessionFactory factory=cfg.buildSessionFactory();
	       Session session=factory.openSession();
	       Transaction tr= session.beginTransaction();
	       //Fetch the person object
	       Person pr=session.get(Person.class,12);
	       //Updating the person age of Sumathi from 26 to 30
	       pr.setP_age(30);
	       
	       tr.commit();	    
	       System.out.println(pr);	       
	             
    }
    public static void delete()
    {
    	Configuration cfg=new Configuration();
	       cfg.configure();
	       SessionFactory factory=cfg.buildSessionFactory();
	       Session session=factory.openSession();
	       Transaction tr= session.beginTransaction();
	       Person pr=session.get(Person.class,12);
	       session.delete(pr);
	       
	       tr.commit();
	  
    }
}
