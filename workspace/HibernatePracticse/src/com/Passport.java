package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {
@Id

private int pno;


private String tfrom;


private String tto;

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
	return "Passport [pno=" + pno + ", tfrom=" + tfrom + ", tto=" + tto + "]";
}
}
