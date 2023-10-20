package com.FirstMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example1.model.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Connection started");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        System.out.println(factory);
        
    }
}
