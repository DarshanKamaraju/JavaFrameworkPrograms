package com.kodnest.hibernate2.Hibernate1To1UniDirectionalProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	   Configuration cfg=new Configuration();
	       cfg.configure();
	       SessionFactory factory=cfg.buildSessionFactory();
	       Session session=factory.openSession();
	       Transaction tr= session.beginTransaction();
	       
	       Bike b1 = new Bike(101,"Pulsor",120000);
	       Bike b2 = new Bike(102,"KTM",160000);
	       Bike b3 = new Bike(103,"Bullet",180000);
	       
	       Person p1 = new Person(1,"Lasya",6,b1);
	       Person p2 = new Person(2,"Thanvi",3,b2);
	       Person p3 = new Person(3,"Purvi",9,b3);
	       
	       session.save(p1);
	       session.save(p2);
	       session.save(p3);
	       
	       session.save(b1);
	       session.save(b2);
	       session.save(b3);
	       
	       tr.commit();
	       
	       System.out.println("Object is created and Saved");
    	
    }
}
