package com.kodnest.hibernate2.Hibernate1To1BiDirectionalMapping;

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
	      
	       Person p1 = new Person();
	       Person p2 = new Person();
	       Person p3 = new Person();
	       
	       Bike b1 = new Bike(101,"Pulsor",120000,p1);
	       Bike b2 = new Bike(102,"KTM",160000,p2);
	       Bike b3 = new Bike(103,"Bullet",180000,p3);
	       
	       p1.setP_id(1);
	       p1.setP_name("Lasya");
	       p1.setP_age(6);
	       p1.setB(b1);
	       
	       p2.setP_id(2);
	       p2.setP_name("Thanvi");
	       p2.setP_age(3);
	       p2.setB(b2);
	       
	       p3.setP_id(3);
	       p3.setP_name("Purvi");
	       p3.setP_age(9);
	       p3.setB(b3);
	       
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
