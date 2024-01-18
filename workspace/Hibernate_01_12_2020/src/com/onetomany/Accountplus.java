package com.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="acc_no")
	private Account account;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

}

