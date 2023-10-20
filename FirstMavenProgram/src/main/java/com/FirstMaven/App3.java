package com.FirstMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example1.model.Address;
import com.example1.model.Employee;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Connection started");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate3.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        try
        {
        	Employee e1=new Employee();
        	e1.setName("Raju");
        	e1.setSalary(25000);
        	Address a1=new Address();
        	a1.setStreet("mumbai");
        	
        	e1.setAddress1(a1);
        	a1.setEmployee(e1);
        	
        	session.beginTransaction();
        	session.save(e1);
        	session.getTransaction().commit();
        	
        	Employee e2=session.get(Employee.class, e1.getId());
        	Address a2=e2.getAddress1();
        	System.out.println("employee name:"+e2.getName());
        	System.out.println("address:"+a2.getStreet());
        	
        	
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
