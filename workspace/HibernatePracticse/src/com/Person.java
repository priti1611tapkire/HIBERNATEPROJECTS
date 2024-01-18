package com;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PERSONDETAILS")
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;

private String name;
@Column(name="AGE")
private String age;

private String address;
@Column(name="CITIZENSHIP")
private String nationality;

@JoinColumn(name="PERSONPASSPORTID")
@OneToOne(cascade=CascadeType.ALL)
private Passport passport;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public Passport getPassport() {
	return passport;
}
public void setPassport(Passport passport) {
	this.passport = passport;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", nationality="
			+ nationality + ", passport=" + passport + "]";
}

	
}
