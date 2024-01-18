package com.ONE_2_MANY_bidirection;

//ONE TO MANY BIDIRECTIONAL EX

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@ENTITY=TABLE CREATION
//@ID=PRIMARY KEY AUTOGENERATION
//@ONETOMANY=FOR MAPPING CLASS REALTIONSHIPS HERE WE WRITE IN BOTH CASE BCOZ OF BIDIRECTIONAL

//@JOINCLOUMN=FOR PRIMARY KEY CLASS NAMING IN OTHER TABLE...IT ACT AS FORIGN KEY IN ANOTHER CLASS TABLE

@Entity
public class Product {
	@Id
	private int pid;
	
	private String pname;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pcid")
	private Customer customer;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", customer=" + customer + "]";
	}

}
