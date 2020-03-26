package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_POJO;

public class NamedQuery {

	public static void main(String[] args) {

		SessionFactory sf=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		//NamedQueries
		Query q=session.getNamedQuery("ctsEmpView");
		System.out.println("Eno\tEmpname\tSalary");
		List<Emp_POJO> l4=(List<Emp_POJO>)q.list();
		for(Emp_POJO e:l4)
		{
			
			System.out.println(e.getEmpno()+" "+e.getEmpname()+" "+e.getSalary());
		}
		
		Scanner s1=new Scanner(System.in);
		//Parameterized Named Query
		Query q2=session.getNamedQuery("ctsDeleteRecord");
		System.out.println("Enter the Eno :");
		int deno=s1.nextInt();
		q2.setParameter("delno", deno);
		int result=q2.executeUpdate();
		System.out.println(result + "Record Deleted");
		
				
	}
	
}
