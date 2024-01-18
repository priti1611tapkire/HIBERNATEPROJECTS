package com.ONE_2_MANY_unidirection;
 
//ONE TO MANY UNIDIRECTIONAL EX 

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//@ENTITY=TABLE CREATION
//@ID=PRIMARY KEY AUTOGENERATION
//@ONETOMANY=FOR MAPPING CLASS REALTIONSHIPS  

//@JOINCLOUMN=FOR PRIMARY KEY CLASS NAMING IN OTHER TABLE...IT ACT AS FORIGN KEY IN ANOTHER CLASS TABLE


@Entity
public class Customer {
	@Id
	private int cid;
	
	private String cname;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<CustomerOrder> orders;

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

	public List<CustomerOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<CustomerOrder> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", orders=" + orders + "]";
	}

}
