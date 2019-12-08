package com.java.demo.bean;

public class SSN {

	
	private String ssn;
	private String dob;
	
	
	public SSN() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SSN(String ssn, String dob) {
		super();
		this.ssn = ssn;
		this.dob = dob;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
}
