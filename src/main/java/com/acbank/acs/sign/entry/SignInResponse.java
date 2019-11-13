package com.acbank.acs.sign.entry;

import javax.xml.bind.annotation.XmlRootElement;

import com.acbank.acs.commons.entry.Status;

@XmlRootElement(name = "signInResponse")
public class SignInResponse {

	private Status status;
	private SignInEntry signInEntry;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public SignInEntry getSignInEntry() {
		return signInEntry;
	}
	public void setSignInEntry(SignInEntry signInEntry) {
		this.signInEntry = signInEntry;
	}
	
}
