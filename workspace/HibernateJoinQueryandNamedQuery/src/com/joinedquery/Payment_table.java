package com.joinedquery;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment_table {
@Id
	 private int payid;
	 
	 private String date;
	 
	 private double amaount;

	public int getPayid() {
		return payid;
	}

	public void setPayid(int payid) {
		this.payid = payid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmaount() {
		return amaount;
	}

	public void setAmaount(double amaount) {
		this.amaount = amaount;
	}
	@Override
	public String toString() {
		return "Payment_table [payid=" + payid + ", date=" + date + ", amaount=" + amaount + "]";
	}
}
