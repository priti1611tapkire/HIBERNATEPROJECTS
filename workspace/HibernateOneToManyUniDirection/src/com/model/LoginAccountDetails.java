package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginAccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	
	private String laccountname;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLaccountname() {
		return laccountname;
	}

	public void setLaccountname(String laccountname) {
		this.laccountname = laccountname;
	}

	@Override
	public String toString() {
		return "LoginAccountDetails [lid=" + lid + ", laccountname=" + laccountname + "]";
	}
	
	
}

