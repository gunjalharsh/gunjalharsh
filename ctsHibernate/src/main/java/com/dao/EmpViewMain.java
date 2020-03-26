package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_POJO;

public class EmpViewMain {

	public static void main(String[] args) {

			SessionFactory sf=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
			Session session=sf.openSession();
			
			String q1="From Emp_POJO";
			Query q4=session.createQuery(q1);
			List<Emp_POJO>list4=(List<Emp_POJO>)q4.list(); //ResultSet
			for(Emp_POJO e:list4)
			{
				
				System.out.println(e.getEmpno()+" "+e.getEmpname()+" "+e.getSalary());
			}
			System.out.println("*************************************************");
			String Sql_Query ="select max(e1.Salary) from Emp_POJO e1";
			q4=session.createQuery(Sql_Query);
			List l1=q4.list();//execution
			System.out.println("MAX Salary :"+l1.get(0));
			System.out.println("*************************************************");

			Query q5=session.createQuery("from Emp_POJO where Empname='Harshal'");
			List l3=q5.list();
			Emp_POJO ep=(Emp_POJO)l3.get(0);
			System.out.println("Harshal Salary :"+ep.getSalary());
			System.out.println("*************************************************");
			
			//Parameterized Queries
			//Positional Parameter
			//String q="from Emp_POJO where Empno=?";
			
			String q="from Emp_POJO where Empno=:a";
			
			q4=session.createQuery(q);
			System.out.println("Enter the Eno :");
			Scanner sc=new Scanner(System.in);
			int eno11=sc.nextInt();
			q4.setInteger("a", eno11);
			List l2=q4.list();
			Emp_POJO ep2=(Emp_POJO)l2.get(0);
			System.out.println("Name and Salary :" + ep2.getEmpname()+" "+ ep2.getSalary());
			session.close();//detached state
			

			
	}

}
