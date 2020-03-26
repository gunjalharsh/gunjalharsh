package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Meetings_Pojo;
import com.pojo.homeEmployee_ManyPojo;

public class ManyToManyMain {
	public static void main(String[] args) {
		Session s=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
	
		Meetings_Pojo quaterlyMeet = new Meetings_Pojo("Quaterly Status Meeting");
		Meetings_Pojo weeklyMeet = new Meetings_Pojo("Weekly Status Meeting");
		Meetings_Pojo dailyMeet  = new Meetings_Pojo("Daily Status Meeting");

		homeEmployee_ManyPojo empObj1 = new homeEmployee_ManyPojo("Devi", "Priya");
		empObj1.getMeetings().add(quaterlyMeet);
		empObj1.getMeetings().add(weeklyMeet);
		
		s.save(empObj1);

		homeEmployee_ManyPojo empObj2 = new homeEmployee_ManyPojo("Thananya", "Daya");
		empObj2.getMeetings().add(quaterlyMeet);
		s.save(empObj2);

		homeEmployee_ManyPojo empObj3 = new homeEmployee_ManyPojo("Abi", "Lakshmi");			
		empObj3.getMeetings().add(weeklyMeet);
		empObj3.getMeetings().add(dailyMeet);
		s.save(empObj3);

		// Committing The Transactions To The Database
		s.getTransaction().commit();

		System.out.println("\n.......Records Saved Successfully To The Database.......");
	} 

}
