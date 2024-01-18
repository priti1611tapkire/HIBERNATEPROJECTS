package com.practice2_13_12_2020;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerOrder {
	@Id
	private int oid;
	
	private String oname;
	
	//private String otype;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	@Override
	public String toString() {
		return "CustomerOrder [oid=" + oid + ", oname=" + oname + "]";
	}

}
