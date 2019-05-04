package com.acbank.acs.sign.api;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.acbank.acs.sign.SignUpHelper;
import com.acbank.acs.sign.entry.SignUpEntry;
import com.acbank.acs.sign.entry.SignUpResponse;

@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Path("/signUp")
public class SignUp {

	SignUpHelper signUpHelper = new SignUpHelper();

	@POST
	@Path("/do")
	public SignUpResponse doSignIn(SignUpEntry signUpEntry) throws ClassNotFoundException, SQLException {
		SignUpResponse signUpResponse = signUpHelper.signUp(signUpEntry);
		return signUpResponse;
	}

}
