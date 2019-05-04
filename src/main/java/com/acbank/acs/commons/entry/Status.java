package com.acbank.acs.commons.entry;

import javax.xml.bind.annotation.XmlRootElement;

import com.acbank.acs.commons.constant.State;

@XmlRootElement(name = "status")
public class Status {

	private int statusCode;
	private String statusMessage;
	private State state;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
