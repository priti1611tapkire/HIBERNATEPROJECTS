package com_joined;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Akurdi extends Cjc {

	private String weekendbatches;

	public String getWeekendbatches() {
		return weekendbatches;
	}

	public void setWeekendbatches(String weekendbatches) {
		this.weekendbatches = weekendbatches;
	}

	@Override
	public String toString() {
		return "Akurdi [weekendbatches=" + weekendbatches + "]";
	}
}
