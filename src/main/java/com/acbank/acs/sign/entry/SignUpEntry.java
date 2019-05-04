package com.acbank.acs.sign.entry;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "signUpEntry")
public class SignUpEntry {

	private String name;
	private String password;
	private String email;
	private Long accountNo;
	private Long aadhaar;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public Long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(Long aadhaar) {
		this.aadhaar = aadhaar;
	}
}
