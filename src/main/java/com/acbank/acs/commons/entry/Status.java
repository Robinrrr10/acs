package com.acbank.acs.commons.entry;

import javax.xml.bind.annotation.XmlRootElement;

import com.acbank.acs.commons.constant.State;

@XmlRootElement(name = "status")
public class Status {

	private int statusCoder;
	private String statusMessage;
	private State state;

	public int getStatusCoder() {
		return statusCoder;
	}

	public void setStatusCoder(int statusCoder) {
		this.statusCoder = statusCoder;
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
