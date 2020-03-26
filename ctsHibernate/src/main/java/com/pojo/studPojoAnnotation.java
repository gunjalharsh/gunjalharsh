package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentDemo")
public class studPojoAnnotation {
		
	@Id
	 @Column(name="ID")
	int id;
	 @Column(name="STUDENT_NAME")

	String studentName;
	 @Column(name="ROLL_NUMBER")

	int rollNumber;
	 @Column(name="COURSE")

	String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
