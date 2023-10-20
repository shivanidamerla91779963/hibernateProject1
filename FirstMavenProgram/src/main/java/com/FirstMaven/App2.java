package com.FirstMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lab.Passport;
import com.lab.Person;


public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();
		cfg.configure("hibernate2.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		try
		{
			Person p1=new Person();
			p1.setName("Ram");
			
			Passport r1=new Passport();
			r1.setP_no(9876);
			
			
			p1.setPassport(r1);;
			r1.setPerson(p1);
			
			session.beginTransaction();
			session.save(p1);
			session.getTransaction().commit();
			
			Person p2=session.get(Person.class, p1.getId());
		    Passport r2=p2.getPassport();
			System.out.println("Person: "+p2.getName());
			System.out.println("Passport: "+r2.getP_no());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			factory.close();
		}
		
	}

}

