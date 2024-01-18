package com.pr1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passport {
@Id

private int pno;


private String tfrom;


private String tto;
@JoinColumn(name="PERSOND")
@OneToOne(cascade=CascadeType.ALL)
private Person person;

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

public int getPno() {
	return pno;
}

public void setPno(int pno) {
	this.pno = pno;
}

public String getTfrom() {
	return tfrom;
}

public void setTfrom(String tfrom) {
	this.tfrom = tfrom;
}

public String getTto() {
	return tto;
}

public void setTto(String tto) {
	this.tto = tto;
}

@Override
public String toString() {
	return "Passport [pno=" + pno + ", tfrom=" + tfrom + ", tto=" + tto + ", person=" + person + "]";
}
}

