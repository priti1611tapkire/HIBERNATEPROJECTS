package com.maytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
@Id
private int rollno;

private String name;

private String address;
@ManyToMany(cascade=CascadeType.ALL,mappedBy="student")
//@JoinColumn(name="c_id")
private List<Course> course;

public List<Course> getCourse() {
	return course;
}

public void setCourse(List<Course> course) {
	this.course = course;
}

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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", course=" + course + "]";
}


}
