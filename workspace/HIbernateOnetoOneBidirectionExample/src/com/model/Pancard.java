package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pancard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panid;
	
	private String panName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personpancredid")
	private Person person;

	public int getPanid() {
		return panid;
	}

	public void setPanid(int panid) {
		this.panid = panid;
	}

	public String getPanName() {
		return panName;
	}

	public void setPanName(String panName) {
		this.panName = panName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Pancard [panid=" + panid + ", panName=" + panName + "]";
	}
	
	
}

