package com.cg.bean;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Students")
public class Student 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roll_no", length=10)
	private int rollNo;
	
	@Column(name="stu_name", length=25)
	private String stuName;
	
	@Transient
	private int stuMarks;
	
	
	public Student() {
		super();
		}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuMarks() {
		return stuMarks;
	}
	public void setStuMarks(int stuMarks) {
		this.stuMarks = stuMarks;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName
				+ ", stuMarks=" + stuMarks + "]";
	}
	
	

}
