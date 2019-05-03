package com.acbank.acs.sign.entry;

import javax.xml.bind.annotation.XmlRootElement;

import com.acbank.acs.commons.entry.Status;

@XmlRootElement(name = "signUpResponse")
public class SignUpResponse {

	private Status status;
	private SignUpEntry signUpEntry;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public SignUpEntry getSignUpEntry() {
		return signUpEntry;
	}

	public void setSignUpEntry(SignUpEntry signUpEntry) {
		this.signUpEntry = signUpEntry;
	}
}
