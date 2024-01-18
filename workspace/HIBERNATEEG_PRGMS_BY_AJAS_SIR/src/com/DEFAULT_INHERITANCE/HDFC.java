package com.DEFAULT_INHERITANCE;

//DEFAULT INHERITANCE EX

import javax.persistence.Entity;

@Entity
public class HDFC extends RBI{
	private String hdfcaddress;

	@Override
	public String toString() {
		return "HDFC [hdfcaddress=" + hdfcaddress + "]";
	}

	public String getHdfcaddress() {
		return hdfcaddress;
	}

	public void setHdfcaddress(String hdfcaddress) {
		this.hdfcaddress = hdfcaddress;
	}

}
