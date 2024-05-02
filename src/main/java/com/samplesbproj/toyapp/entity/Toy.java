package com.samplesbproj.toyapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Toy {
	@Id
	private int toyid;
	private String toyname;
	private int toyprice;
	private int toyquantity;
	public int getToyid() {
		return toyid;
	}
	public void setToyid(int toyid) {
		this.toyid = toyid;
	}
	public String getToyname() {
		return toyname;
	}
	public void setToyname(String toyname) {
		this.toyname = toyname;
	}
	public int getToyprice() {
		return toyprice;
	}
	public void setToyprice(int toyprice) {
		this.toyprice = toyprice;
	}
	public int getToyquantity() {
		return toyquantity;
	}
	public void setToyquantity(int toyquantity) {
		this.toyquantity = toyquantity;
	}
	public Toy(int toyid, String toyname, int toyprice, int toyquantity) {
		super();
		this.toyid = toyid;
		this.toyname = toyname;
		this.toyprice = toyprice;
		this.toyquantity = toyquantity;
	}
	public Toy() {
		super();
	}
	

}
