package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	
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

