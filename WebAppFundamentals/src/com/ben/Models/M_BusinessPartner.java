package com.ben.Models;

public class M_BusinessPartner {
	private int b_BusinessPartner_ID;
	private String name;
	private int b_BusinessCategory_ID;
	
	public int getB_BusinessPartner_ID() {
		return b_BusinessPartner_ID;
	}
	public void setB_BusinessPartner_ID(int b_BusinessPartner_ID) {
		this.b_BusinessPartner_ID = b_BusinessPartner_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getB_BusinessCategory_ID() {
		return b_BusinessCategory_ID;
	}
	public void setB_BusinessCategory_ID(int b_BusinessCategory_ID) {
		this.b_BusinessCategory_ID = b_BusinessCategory_ID;
	}
	
}
