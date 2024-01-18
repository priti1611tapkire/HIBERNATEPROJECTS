package com.load;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airways {
	@Id
	private int ticketno;
	private String passeangername;
	private String from1;
	private String to1;
	public int getTicketno() {
		return ticketno;
	}
	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}
	public String getPasseangername() {
		return passeangername;
	}
	public void setPasseangername(String passeangername) {
		this.passeangername = passeangername;
	}
	public String getFrom1() {
		return from1;
	}
	public void setFrom1(String from1) {
		this.from1 = from1;
	}
	public String getTo1() {
		return to1;
	}
	public void setTo1(String to1) {
		this.to1 = to1;
	}
	@Override
	public String toString() {
		return "Airways [ticketno=" + ticketno + ", passeangername=" + passeangername + ", from1=" + from1 + ", to1="
				+ to1 + "]";
	}
	
}
