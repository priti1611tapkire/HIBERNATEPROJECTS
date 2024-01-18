package com.ONE_2_ONE_unidirection;

//ONE TO ONE UNIDIRECTION EX

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


//@ENTITY=TABLE CREATION
//@ID=PRIMARY KEY AUTOGENERATION
//@ONETOONE=FOR MAPPING CLASS REALTIONSHIPS
//@JOINCLOUMN=FOR PRIMARY KEY CLASS NAMING IN OTHER TABLE...IT ACT AS FORIGN KEY IN ANOTHER CLASS TABLE


@Entity
public class Person {
	@Id
	private int id;
	
	private String pname;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passportid")
	private Passport p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Passport getP() {
		return p;
	}
	public void setP(Passport p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + ", p=" + p + "]";
	}

}
