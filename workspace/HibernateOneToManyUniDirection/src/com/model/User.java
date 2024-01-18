package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	private String uname;
	
	private String pass;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<LoginAccountDetails> loginAccountDetails=new ArrayList<LoginAccountDetails>();

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	public List<LoginAccountDetails> getLoginAccountDetails() {
		return loginAccountDetails;
	}

	public void setLoginAccountDetails(List<LoginAccountDetails> loginAccountDetails) {
		this.loginAccountDetails = loginAccountDetails;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", pass=" + pass + ", loginAccountDetails="
				+ loginAccountDetails + "]";
	}
	
}

