package com.ben.Models;

public class M_Product {
	private int b_Product_ID;
	private String name;
	private String portionType;
	private int portionSize;
	private int caseSize;
	
	public int getB_Product_ID() {
		return b_Product_ID;
	}
	public void setB_Product_ID(int b_Product_ID) {
		this.b_Product_ID = b_Product_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPortionType() {
		return portionType;
	}
	public void setPortionType(String portionType) {
		this.portionType = portionType;
	}
	public int getPortionSize() {
		return portionSize;
	}
	public void setPortionSize(int portionSize) {
		this.portionSize = portionSize;
	}
	public int getCaseSize() {
		return caseSize;
	}
	public void setCaseSize(int caseSize) {
		this.caseSize = caseSize;
	}
	
}
