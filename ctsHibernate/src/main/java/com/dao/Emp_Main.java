package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_POJO;

public class Emp_Main {
	public static void main (String args[]) {
		SessionFactory sessionfactory=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionfactory.openSession();

		
		Transaction tx=session.beginTransaction();
		Emp_POJO e1=new Emp_POJO();
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Eno :");
		int Empno=scan.nextInt();
		System.out.println("Name :");
		String Empname=scan.next();
		System.out.println("Salary :");

		float Salary=scan.nextFloat();
		
		e1.setEmpno(Empno);
		e1.setEmpname(Empname);
		e1.setSalary(Salary);
		
		session.persist(e1);
		tx.commit();
		System.out.println("***********Inserted************");
	}
	

}
