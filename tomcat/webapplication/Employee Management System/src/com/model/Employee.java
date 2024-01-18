package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	
	private String name;
	
	private String address;
	
	private String panno;
	
	private String adharno;
	
	private String edob;
	
	private int eage;
	
	private String email;
	
	private long emob;
	
	private String username;
	
	private String password;
	
	public long getEmob() {
		return emob;
	}

	public void setEmob(long emob) {
		this.emob = emob;
	}

	

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

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

	public String getEdob() {
		return edob;
	}

	public void setEdob(String edob) {
		this.edob = edob;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", panno=" + panno + ", adharno="
				+ adharno + ", edob=" + edob + ", eage=" + eage + ", email=" + email + ", emob=" + emob + ", username="
				+ username + ", password=" + password + "]";
	}

}
