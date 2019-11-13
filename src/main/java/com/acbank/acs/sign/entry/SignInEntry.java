package com.acbank.acs.sign.entry;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SignInEntry")
public class SignInEntry {

	private String email;
	private String password;
	private Long accountNo;
	
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
