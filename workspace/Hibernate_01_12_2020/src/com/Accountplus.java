package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accountplus {
	@Id
	private int acpid;
	private int amt;
	public int getAcpid() {
		return acpid;
	}
	public void setAcpid(int acpid) {
		this.acpid = acpid;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	

}
