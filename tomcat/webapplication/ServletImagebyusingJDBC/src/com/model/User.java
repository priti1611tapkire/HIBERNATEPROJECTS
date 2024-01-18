package com.model;

import java.io.InputStream;

public class User {
private int id;
	
	private String name;
	
	private String address;
	
	private InputStream fname;
	
	private String ftype;
	
	public transient String base64image;

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

	public InputStream getFname() {
		return fname;
	}

	public void setFname(InputStream fname) {
		this.fname = fname;
	}

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public String getBase64image() {
		return base64image;
	}

	public void setBase64image(String base64image) {
		this.base64image = base64image;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", fname=" + fname + ", ftype=" + ftype
				+ ", base64image=" + base64image + "]";
	}
	
	
}
