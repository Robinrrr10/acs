package com.acbank.acs.sign.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.acbank.acs.commons.constant.State;
import com.acbank.acs.commons.entry.Status;
import com.acbank.acs.sign.entry.SignUpEntry;
import com.acbank.acs.sign.entry.SignUpResponse;

@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Path("/signUp")
public class SignUp {

	@POST
	@Path("/do")
	public SignUpResponse doSignIn(SignUpEntry signUpEntry) {
		SignUpResponse signUpResponse = new SignUpResponse();
		Status status = new Status();
		status.setState(State.SUCCESS);
		status.setStatusCoder(1001);
		status.setStatusMessage("SignUp done successfully");
		signUpResponse.setStatus(status);
		return signUpResponse;
	}

}
