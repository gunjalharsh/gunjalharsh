package com.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ctsVendor")
public class vendorPojo {
	@Id
	@Column(name="vendorNo")
	int vid;
	@Column(name="vendorName")
	String vname;
	@Column(name="vendorEmail")
	String email;
	
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=customerPojo.class,cascade=CascadeType.ALL)
	//name-> child table column name
	//referenced-> parent table column name
	//setting column name
	@JoinColumn(name="vendorId",referencedColumnName="vendorNo")  //vendorId is act like foreign key
	
	Set cust;  //collection referenced  variable
	
	public Set getCust() {
		return cust;
	}
	public void setCust(Set cust) {
		this.cust = cust;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
