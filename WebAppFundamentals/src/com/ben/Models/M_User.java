package com.ben.Models;

public class M_User {
	private int b_User_ID;
	private int b_BusinessPartner_ID;
	private String username;
	private String password;
	private String phoneNo;
	private String mobileNo;
	private String email;
	private String name;

	public int getB_BusinessPartner_ID() {
		return b_BusinessPartner_ID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getB_User_ID() {
		return b_User_ID;
	}
	public void setB_User_ID(int b_User_ID) {
		this.b_User_ID = b_User_ID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
