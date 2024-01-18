package com.task;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQueries({
//	@NamedQuery(name="s_All", query="From Student"),
//	@NamedQuery(name="s_all_id", query="from Student where rollno=:rno")
//	
//})
@NamedNativeQueries({
@NamedNativeQuery(name="s_All", query="select * From Student", resultClass=Student.class),
//@NamedNativeQuery(name="s_all_id", query="from Student where rollno=:rno")

})

public class Student {
	
	@Id
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
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
	}

}
