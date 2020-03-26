package com.pojo;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="meetingmany1")
public class Meetings_Pojo {
	
	
	@Id
	@Column(name="meeting_id")
	@GeneratedValue
	private Long meetingId;

	@Column(name="subject")
	private String subject;

	@Column(name="meeting_date")
	private Date meetingDate;
//meetings==homeEmployee_ManyPojo(Set)
	@ManyToMany(mappedBy="meetings")
	private Set<homeEmployee_ManyPojo> employees = new HashSet<homeEmployee_ManyPojo>();

	public Meetings_Pojo() { }

	public Meetings_Pojo(String subject) {
		this.subject = subject;
		this.meetingDate = new Date();
	}

	public Long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Long meeting_id) {
		this.meetingId = meeting_id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject_name) {
		this.subject = subject_name;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meeting_date) {
		this.meetingDate = meeting_date;
	}

	public Set<homeEmployee_ManyPojo> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<homeEmployee_ManyPojo> employees) {
		this.employees = employees;
	}

}
