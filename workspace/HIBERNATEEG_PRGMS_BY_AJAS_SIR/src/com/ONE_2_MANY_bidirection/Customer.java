package com.ONE_2_MANY_bidirection;
//ONE TO MANY BIDIRECTIONAL EX
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//@ENTITY=TABLE CREATION
//@ID=PRIMARY KEY AUTOGENERATION
//@ONETOMANY=FOR MAPPING CLASS REALTIONSHIPS HERE WE WRITE IN BOTH CASE BCOZ OF BIDIRECTIONAL

//@JOINCLOUMN=FOR PRIMARY KEY CLASS NAMING IN OTHER TABLE...IT ACT AS FORIGN KEY IN ANOTHER CLASS TABLE

@Entity
public class Customer {
	@Id
	private int cid;
	
	private String cname;
	
	@OneToMany(cascade= CascadeType.ALL)
	private List<Product> products=new ArrayList<>();

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
		return "Customer [cid=" + cid + ", cname=" + cname + ", products=" + products + "]";
	}
	

}
