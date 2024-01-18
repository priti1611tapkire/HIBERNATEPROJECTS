package com.ONE_2_MANY_unidirection;

//ONE TO MANY UNIDIRECTIONAL EX 

import javax.persistence.Entity;
import javax.persistence.Id;

//@ENTITY=TABLE CREATION
//@ID=PRIMARY KEY AUTOGENERATION

@Entity
public class CustomerOrder {
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
		return "CustomerOrder [oid=" + oid + ", oname=" + oname + "]";
	}
	

}
