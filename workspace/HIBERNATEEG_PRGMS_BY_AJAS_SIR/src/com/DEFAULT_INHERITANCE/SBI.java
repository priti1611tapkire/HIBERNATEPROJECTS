package com.DEFAULT_INHERITANCE;

//DEFAULT INHERITANCE EX

import javax.persistence.Entity;

@Entity
public class SBI extends RBI {
	
	private String sbiaddress;

	public String getSbiaddress() {
		return sbiaddress;
	}

	public void setSbiaddress(String sbiaddress) {
		this.sbiaddress = sbiaddress;
	}

	@Override
	public String toString() {
		return "SBI [sbiaddress=" + sbiaddress + "]";
	}
	

}
