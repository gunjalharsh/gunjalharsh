package com.homeBeanClasses;

public class homeEmployee {
	
	int eno;
	String name;
	float salary;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString(){
		return "{Eno="+eno+",Name="+name+",Salary="+salary+"}";
	}
	

}
