package com.onetomanyunidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Custmor {
	@Id
	private int cid;
	
	private String cname;
	
	@OneToMany(cascade= CascadeType.ALL)
	private List<Product> products=new ArrayList<Product>();

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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Custmor [cid=" + cid + ", cname=" + cname + ", products=" + products + "]";
	}
	
	
		

}
