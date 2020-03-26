package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_POJO;
import com.pojo.studPojoAnnotation;

public class studAnnoMain {

	public static void main(String[] args) {
		SessionFactory sessionfactory=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionfactory.openSession();

		
		Transaction tx=session.beginTransaction();
		studPojoAnnotation s1=new studPojoAnnotation();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Student Id :");
		int id=scan.nextInt();
		System.out.println("Enter the Student Name :");
		String studentName=scan.next();
		System.out.println("Enter the Students RollNumber :");
		int rollNumber=scan.nextInt();
		System.out.println("Enter the Student Course :");
		String course=scan.next();
		
		s1.setId(id);
		s1.setStudentName(studentName);
		s1.setRollNumber(rollNumber);
		s1.setCourse(course);
		
		session.persist(s1);
		tx.commit();
		
		
	}

}
