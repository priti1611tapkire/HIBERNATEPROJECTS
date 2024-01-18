package com.ONE_2_ONE_bidirection;

//ONE TO ONE BIDIRECTION EX

//@ENTITY=TABLE CREATION
//@ID=PRIMARY KEY AUTOGENERATION
//@ONETOONE=FOR MAPPING CLASS REALTIONSHIPS BIDIRECTION
//@JOINCLOUMN=FOR PRIMARY KEY CLASS NAMING IN OTHER TABLE...IT ACT AS FORIGN KEY IN ANOTHER CLASS TABLE


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adharcard {

	@Id
	private int aid;
	
	private String adharnumber;
	@OneToOne(cascade=CascadeType.ALL,mappedBy="a")//
	private User u;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAdharnumber() {
		return adharnumber;
	}
	public void setAdharnumber(String adharnumber) {
		this.adharnumber = adharnumber;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "Adharcard [aid=" + aid + ", adharnumber=" + adharnumber + ", u=" + u + "]";
	}
}
