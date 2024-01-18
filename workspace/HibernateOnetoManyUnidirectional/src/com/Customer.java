package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	private int cid;
	
	private String cname;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Customerorder> orders;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Customerorder> getOrders() {
		return orders;
	}

	public void setOrders(List<Customerorder> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", orders=" + orders + "]";
	}
	
	
}
