package com.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.customerPojo;
import com.pojo.vendorPojo;

public class custViewMain {

	public static void main(String[] args) {

		
		SessionFactory sessionfactory=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionfactory.openSession();

		
		Transaction tx=session.beginTransaction();
		
		vendorPojo v1=new vendorPojo();
		customerPojo c1=new customerPojo();
		customerPojo c2=new customerPojo();
		v1.setVid(007);
		v1.setVname("Cognizant");
		v1.setEmail("cognizant@cognizant.com");
		
		c1.setCid(1);
		c1.setCname("BLT");
		c2.setCid(2);
		c2.setCname("MindSpeed");
		
		Set s1=new HashSet();
		s1.add(c1);
		s1.add(c2);
		
		v1.setCust(s1);   //one to many rel.
		session.save(v1);
		tx.commit();
		session.close();
		System.out.println("One to Many Done ");
	}

}
