package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	@Id
	private int cid;

	private String customername;

	private String contactname;

	private String address;

	private String city;

	private int postalcode;

	private String country;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", customername=" + customername + ", contactname=" + contactname + ", address="
				+ address + ", city=" + city + ", postalcode=" + postalcode + ", country=" + country + "]";
	}

}
