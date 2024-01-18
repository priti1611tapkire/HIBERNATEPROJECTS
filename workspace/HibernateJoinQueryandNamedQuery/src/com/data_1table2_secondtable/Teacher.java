package com.data_1table2_secondtable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name = "getAll",query = "from Teacher")
//@NamedQuery(name = "singleData",query = "from Teacher where id=:id1")

@NamedQueries({
	@NamedQuery(name = "getAll",query = "from Teacher"),
	@NamedQuery(name = "singleData",query = "from Teacher where id=:id1"),
	@NamedQuery(name = "deleteData",query = "delete from Teacher where id=:i"),
	@NamedQuery(name = "updateData",query = "update Teacher set name=:n,address=:a where id=:i"),
	@NamedQuery(name = "insertInNewTable",query = "insert into Student(sid,sname,saddress)"
			+ "select id,name,address from Teacher")
})
public class Teacher {

	@Id
	private int id;
	
	private String name;
	
	private String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
