package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customerorder {
	
	@Id
	private int oid;
	
	private String oname;

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
		return "Customerorder [oid=" + oid + ", oname=" + oname + "]";
	}
	
	

}
