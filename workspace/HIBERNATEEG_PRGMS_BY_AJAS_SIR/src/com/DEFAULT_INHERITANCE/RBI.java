package com.DEFAULT_INHERITANCE;

//DEFAULT INHERITANCE EX

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


//DEFAULT INHERITANCE //CHILD CLASS TABLES GENERTARED HERE ONLY
//NO @ID GIVEN IN CHILD CLASS
//NO @ENTITY IN SUPERCLASS(PARENT CLASS)
//INSTEAD OF @ENTITY WE WRITE @MappedSuperclass


@MappedSuperclass
public class RBI {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int rid;

private String rule;

public int getRid() {
	return rid;
}

public void setRid(int i) {
	this.rid = i;
}

public String getRule() {
	return rule;
}

public void setRule(String rule) {
	this.rule = rule;
}

@Override
public String toString() {
	return "RBI [rid=" + rid + ", rule=" + rule + "]";
}
}
