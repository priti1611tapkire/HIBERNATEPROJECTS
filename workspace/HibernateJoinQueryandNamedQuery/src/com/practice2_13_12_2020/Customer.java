package com.practice2_13_12_2020;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {

	@Id
	private int cid;
	
	private String cname;
	
//	private String caddress;

//	public String getCaddress() {
//		return caddress;
//	}
//
//	public void setCaddress(String caddress) {
//		this.caddress = caddress;
//	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "]";
	}
	

}
