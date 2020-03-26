package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.studPojoAnnotation;

public class studViewMain {

	public static void main(String[] args) {

		
		SessionFactory sf=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		

		String q1="From studPojoAnnotation";
		Query q4=session.createQuery(q1);
		List<studPojoAnnotation>list4=(List<studPojoAnnotation>)q4.list(); //ResultSet
		for(studPojoAnnotation e:list4)
		{
			
			System.out.println(e.getId()+" "+e.getStudentName()+" "+ e.getRollNumber()+" "+e.getCourse());
		}
	}

}
