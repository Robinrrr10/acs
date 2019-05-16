package com.acbank.acs.sign;

import com.acbank.acs.sign.entry.SignInEntry;
import com.acbank.acs.sign.entry.SignInResponse;

import java.sql.SQLException;

import com.acbank.acs.commons.constant.State;
import com.acbank.acs.commons.constant.StatusCodes;
import com.acbank.acs.commons.constant.StatusMessages;
import com.acbank.acs.commons.entry.Status;
import com.acbank.acs.sign.db.SignUpDBHelper;

public class SignInHelper {
	
	SignUpDBHelper SignUpDBHelper = new SignUpDBHelper();

	public SignInResponse checkSignIn(SignInEntry signInEntry) throws ClassNotFoundException, SQLException {
		SignInResponse signInResponse = new SignInResponse();
		Status status = new Status();
		Long accountNo = null;
		accountNo = SignUpDBHelper.getAccountNo(signInEntry.getEmail(), signInEntry.getPassword());
		if(accountNo!=null && !accountNo.equals(0)) {
			SignInEntry signInEntryResponse = new SignInEntry();
			status.setStatusCode(StatusCodes.SIGNIN_SUCCESS);
			status.setStatusMessage(StatusMessages.SIGNIN_SUCCESS);
			status.setState(State.SUCCESS);
			signInResponse.setSignInEntry(signInEntryResponse);
		}else {
			status.setStatusCode(StatusCodes.SIGNIN_FAIL);
			status.setStatusMessage(StatusMessages.SIGNIN_FAILS);
			status.setState(State.ERROR);
		}
		signInResponse.setStatus(status);
		return signInResponse;
	}
	
}
