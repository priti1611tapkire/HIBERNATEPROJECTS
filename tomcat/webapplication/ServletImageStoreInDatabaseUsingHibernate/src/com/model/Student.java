package com.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Student {
	
	@Id
	private int id;
	
	private String name;
	
	private String uname;
	
	private String pass;
	
	@Lob
	private byte[] filename;
	
	private String fname;

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

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public byte[] getFilename() {
		return filename;
	}

	public void setFilename(byte[] filename) {
		this.filename = filename;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", uname=" + uname + ", pass=" + pass + ", filename="
				+ Arrays.toString(filename) + ", fname=" + fname + "]";
	}
	

}
