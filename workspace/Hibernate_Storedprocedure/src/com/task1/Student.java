package com.task1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student {
	@Id
	private int rollno;
	
	private String name;
	
	private String addr;
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@OneToMany(cascade=CascadeType.ALL)
	Set<Phone> ph=new HashSet<>();

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

	public Set<Phone> getPh() {
		return ph;
	}

	public void setPh(Set<Phone> ph) {
		this.ph = ph;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + ", ph=" + ph + "]";
	}

	
}
