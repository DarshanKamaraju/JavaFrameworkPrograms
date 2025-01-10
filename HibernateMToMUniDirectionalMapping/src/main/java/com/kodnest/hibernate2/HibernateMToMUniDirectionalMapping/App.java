package com.kodnest.hibernate2.HibernateMToMUniDirectionalMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Technology t1=new Technology();
    	Technology t2=new Technology();
    	Technology t3=new Technology();
    	Technology t4=new Technology();
    	
    	t1.setT_id(123);
    	t1.setT_name("Java");
    	
    	t2.setT_id(124);
    	t2.setT_name("HTML");
    	
    	t3.setT_id(125);
    	t3.setT_name("CSS");
    	
    	t4.setT_id(126);
    	t4.setT_name("SQL");
    	
    	List<Technology> techList1=new ArrayList<Technology>();
    	techList1.add(t1);
    	techList1.add(t2);
    	
    	List<Technology> techList2=new ArrayList<Technology>();
    	techList2.add(t1);
    	techList2.add(t2);
    	techList2.add(t3);
    	techList2.add(t4);
    	
    	List<Technology> techList3=new ArrayList<Technology>();
    	techList3.add(t1);
    	techList3.add(t4);
    	

    	SoftwareEng se1=new SoftwareEng();
    	SoftwareEng se2=new SoftwareEng();
    	SoftwareEng se3=new SoftwareEng();
    	
    	se1.setId(1);
    	se1.setName("Sumit");
    	se1.setAge(29);
    	se1.setT_id(techList1);
    	
    	se2.setId(2);
    	se2.setName("Sourav");
    	se2.setAge(30);
    	se2.setT_id(techList2);
    	
    	se3.setId(3);
    	se3.setName("Sachin");
    	se3.setAge(28);
    	se3.setT_id(techList3);
    	
    	Configuration cfg=new Configuration();
	       cfg.configure();
	       SessionFactory factory=cfg.buildSessionFactory();
	       Session session=factory.openSession();
	       Transaction tr= session.beginTransaction();
    	
    	session.save(t1);
    	session.save(t2);
    	session.save(t3);
    	session.save(t4);
    	session.save(se1);
    	session.save(se2);
    	session.save(se3);
    	
    	tr.commit();
        System.out.println( "Objects are Saved" );
    }
}
