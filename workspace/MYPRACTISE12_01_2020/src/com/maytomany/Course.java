package com.maytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
@Id
private int cid;

private String Cname;
@ManyToMany(cascade=CascadeType.ALL)
private List<Student> student;

public List<Student> getStudent() {
	return student;
}

public void setStudent(List<Student> student) {
	student = student;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return Cname;
}

public void setCname(String cname) {
	Cname = cname;
}

@Override
public String toString() {
	return "Course [cid=" + cid + ", Cname=" + Cname + ", student=" + student + "]";
}


}
