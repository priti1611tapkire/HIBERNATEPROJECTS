package com.ONE_2_ONE_unidirection;

//ONE TO ONE UNIDIRECTION EX

import javax.persistence.Entity;
import javax.persistence.Id;


//@ENTITY=TABLE CREATION
//@ID=PRIMARY KEY AUTOGENERATION



@Entity
public class Passport {
	@Id
	private int pid;
	
	private String passporttype;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPassporttype() {
		return passporttype;
	}

	public void setPassporttype(String passporttype) {
		this.passporttype = passporttype;
	}

	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", passporttype=" + passporttype + "]";
	}
	
	

}
