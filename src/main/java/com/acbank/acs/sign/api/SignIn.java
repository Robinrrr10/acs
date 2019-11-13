package com.acbank.acs.sign.api;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.acbank.acs.sign.SignInHelper;
import com.acbank.acs.sign.entry.SignInEntry;
import com.acbank.acs.sign.entry.SignInResponse;

@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Path("/signIn")
public class SignIn {
	
	SignInHelper signInHelper = new SignInHelper();

	@Path("/do")
	@POST
	public SignInResponse signIn(SignInEntry signInEntry) throws ClassNotFoundException, SQLException {
		SignInResponse signInResponse = signInHelper.checkSignIn(signInEntry);
		return signInResponse;
	}
	
}
