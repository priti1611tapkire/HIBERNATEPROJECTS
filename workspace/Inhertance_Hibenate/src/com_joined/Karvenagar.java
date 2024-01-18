package com_joined;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Karvenagar extends Cjc {
	private String regularbatch;

	public String getRegularbatch() {
		return regularbatch;
	}

	public void setRegularbatch(String regularbatch) {
		this.regularbatch = regularbatch;
	}

	@Override
	public String toString() {
		return "Karvenagar [regularbatch=" + regularbatch + "]";
	}

}
