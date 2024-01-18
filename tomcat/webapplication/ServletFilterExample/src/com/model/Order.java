package com.model;

public class Order {
	
	private int odi;
	
	private String oname;
	
	private String odate;

	public int getOdi() {
		return odi;
	}

	public void setOdi(int odi) {
		this.odi = odi;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getOdate() {
		return odate;
	}

	public void setOdate(String odate) {
		this.odate = odate;
	}

	@Override
	public String toString() {
		return "Order [odi=" + odi + ", oname=" + oname + ", odate=" + odate + "]";
	}
	

}
