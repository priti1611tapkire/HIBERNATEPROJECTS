package com.singletable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@DiscriminatorValue(value = "AKD")


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
