package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int aId;
	private String pAddr;
	private String tAddr;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getpAddr() {
		return pAddr;
	}
	public void setpAddr(String pAddr) {
		this.pAddr = pAddr;
	}
	public String gettAddr() {
		return tAddr;
	}
	public void settAddr(String tAddr) {
		this.tAddr = tAddr;
	}
}
