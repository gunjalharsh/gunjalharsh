package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ctsCustomer")
public class customerPojo {
	@Id
	@Column(name="custid",nullable=false)
	int cid;
	@Column(name="custname",nullable=false,length=30)
	String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
