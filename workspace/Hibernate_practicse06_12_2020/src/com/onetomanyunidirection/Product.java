package com.onetomanyunidirection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
private int pid;
private String pname;

@ManyToOne(cascade=CascadeType.ALL)
private Custmor custmor;

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

public Custmor getCustmor() {
	return custmor;
}

public void setCustmor(Custmor custmor) {
	this.custmor = custmor;
}

@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", custmor=" + custmor + "]";
}


}
