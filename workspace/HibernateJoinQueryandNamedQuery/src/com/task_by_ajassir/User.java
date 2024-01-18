package com.task_by_ajassir;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

//BY USING PREPAERED STATEMENT


@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name = "insertData", query = "insert into user(id,name,address) values(?,?,?)",resultClass = User.class)
})
public class User {

	@Id
	private int id;
	
	private String name;
	
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

