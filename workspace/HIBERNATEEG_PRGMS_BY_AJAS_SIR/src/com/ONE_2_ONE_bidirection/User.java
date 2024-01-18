package com.ONE_2_ONE_bidirection;

//ONE TO ONE BIDIRECTION EX

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

//@ENTITY=TABLE CREATION
//@ID=PRIMARY KEY AUTOGENERATION
//@ONETOONE=FOR MAPPING CLASS REALTIONSHIPS  HERE WE WRITE IN BOTH CLASS SO ITS BIDIRECTIONAL

//@JOINCLOUMN=FOR PRIMARY KEY CLASS NAMING IN OTHER TABLE...IT ACT AS FORIGN KEY IN ANOTHER CLASS TABLE


@Entity
public class User {
	@Id
	private int id;
	
	private String uname;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="useradaharid")
	private Adharcard a;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Adharcard getA() {
		return a;
	}

	public void setA(Adharcard a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", a=" + a + "]";
	}

}
