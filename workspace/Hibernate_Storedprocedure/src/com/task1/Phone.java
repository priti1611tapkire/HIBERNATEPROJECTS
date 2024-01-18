package com.task1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
@Id
	private int id;

	private String phono;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="r_no")
	private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getphono() {
		return phono;
	}

	public void setPhoto(String phono) {
		this.phono = phono;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", phono=" + phono + ", student=" + student + "]";
	}
}
