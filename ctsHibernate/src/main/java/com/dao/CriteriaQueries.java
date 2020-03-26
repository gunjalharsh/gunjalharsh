package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pojo.Emp_POJO;

public class CriteriaQueries {

	public static void main(String[] args) {
		Session s=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Transaction t=s.beginTransaction();
		Criteria cr=s.createCriteria(Emp_POJO.class);
		
		//cr.add(Restrictions.gt("Salary", 50000.00F));
		cr.add(Restrictions.between("Salary", 25000.00F, 4800000.00f));
		List employee=cr.list();
		List<Emp_POJO> l4=(List<Emp_POJO>)cr.list();
		for(Emp_POJO e:l4)
		{
			
			System.out.println("First Criteria :"+e.getEmpno()+" "+e.getEmpname()+" "+e.getSalary());
		}
		Criteria cr11=s.createCriteria(Emp_POJO.class);
		cr11.setProjection(Projections.sum("Salary"));
		List totalSalary=cr11.list();
		System.out.println("Total Salary :"+totalSalary);
	}

}
