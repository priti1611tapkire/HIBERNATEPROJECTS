package com.practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonalDetails {
	@Id
	private int panid;
	
	private String name;
	
	private String address;
	
	private double weight;
	
	private int age;
	
	private String gender;
	
	private String mobileno;

	public int getPanid() {
		return panid;
	}

	public void setPanid(int panid) {
		this.panid = panid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "PersonalDetails [panid=" + panid + ", name=" + name + ", address=" + address + ", weight=" + weight
				+ ", age=" + age + ", gender=" + gender + ", mobileno=" + mobileno + "]";
	}
}
