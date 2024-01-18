package com.joinedquery;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Staff_table {
	@Id
	private int sid;
	
	private String sname;
	
	private int sage;
	
	private String saddress;
	
	private double monthlypakg;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Payment_table  pt;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public double getMonthlypakg() {
		return monthlypakg;
	}

	public void setMonthlypakg(double monthlypakg) {
		this.monthlypakg = monthlypakg;
	}

	public Payment_table getPt() {
		return pt;
	}

	public void setPt(Payment_table pt) {
		this.pt = pt;
	}

	@Override
	public String toString() {
		return "Staff_table [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress
				+ ", monthlypakg=" + monthlypakg + ", pt=" + pt + "]";
	}
	

}
