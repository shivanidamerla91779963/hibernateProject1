package com.FirstMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lab.Student;

public class App1 {

	public static void main(String[] args) {
		
		System.out.println("connection started");
		Configuration cfg=new Configuration();
        cfg.configure("hibernate1.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        try
        {
        	Student s1=new Student();
        	s1.setAge(21);
        	s1.setName("john");
        	s.beginTransaction();
        	s.save(s1);
        	s.getTransaction().commit();
        	
        	Student s2=new Student();
        	s2.setAge(22);
        	s2.setName("johny");
        	s.beginTransaction();
        	s.save(s2);
        	s.getTransaction().commit();
        	
        	Student s3=new Student();
        	s3.setAge(23);
        	s3.setName("johnson");
        	s.beginTransaction();
        	s.save(s3);
        	s.getTransaction().commit();
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally
        {
        	s.close();
        	factory.close();
        }

	}

}
