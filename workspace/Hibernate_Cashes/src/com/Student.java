package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name="STUDENTDETAILS")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	@Column(name="STUNAME" , length=200, nullable=false, unique=false )
	private String name;
	
	private String addr;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String address) {
		this.addr = address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + addr + "]";
	}

}
