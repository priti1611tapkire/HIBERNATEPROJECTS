package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	private int teammembers;
	private String teammates;
	private String work;
	public int getTeammembers() {
		return teammembers;
	}
	public void setTeammembers(int teammembers) {
		this.teammembers = teammembers;
	}
	public String getTeammates() {
		return teammates;
	}
	public void setTeammates(String teammates) {
		this.teammates = teammates;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public String toString() {
		return "Team [teammembers=" + teammembers + ", teammates=" + teammates + ", work=" + work + "]";
	}
	
	

}
