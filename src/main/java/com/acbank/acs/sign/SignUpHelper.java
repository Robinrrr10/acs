package com.acbank.acs.sign;

import java.sql.SQLException;

import com.acbank.acs.commons.constant.State;
import com.acbank.acs.commons.constant.StatusCodes;
import com.acbank.acs.commons.constant.StatusMessages;
import com.acbank.acs.commons.entry.Status;
import com.acbank.acs.sign.db.SignUpDBHelper;
import com.acbank.acs.sign.entry.SignUpEntry;
import com.acbank.acs.sign.entry.SignUpResponse;

public class SignUpHelper {

	SignUpDBHelper signUpDBHelper = new SignUpDBHelper();

	public boolean isUserExists(String email, String password) throws ClassNotFoundException, SQLException {
		boolean isUserExists = false;
		Long userAccountNo = null;
		userAccountNo = signUpDBHelper.getAccountNo(email, password);
		if (userAccountNo != null) {
			isUserExists = true;
		}
		return isUserExists;
	}

	public SignUpResponse signUp(SignUpEntry signUpEntry) throws ClassNotFoundException, SQLException {
		SignUpResponse signUpResponse = new SignUpResponse();
		Status status = new Status();
		if (this.itHasMandatoryParameterForSignUp(signUpEntry)) {
			if (isUserExists(signUpEntry.getEmail(), signUpEntry.getPassword())) {
				status.setStatusCode(StatusCodes.SIGNUP_FAILS_USER_ALREADY_EXISTS);
				status.setStatusMessage(StatusMessages.SIGNUP_FAILS_USER_ALREADY_EXISTS);
				status.setState(State.ERROR);
			} else {
				int isAdded = 0;
				Long newlyAddedAccountNo = null;
				isAdded = signUpDBHelper.addNewAccount(signUpEntry.getName(), signUpEntry.getPassword(),
						signUpEntry.getEmail(), signUpEntry.getAadhaar());
				newlyAddedAccountNo = signUpDBHelper.getAccountNo(signUpEntry.getEmail(), signUpEntry.getPassword());
				if (isAdded == 1 && !newlyAddedAccountNo.equals(null) && !newlyAddedAccountNo.equals(0l)) {
					SignUpEntry signUpEntryInResponse = new SignUpEntry();
					status.setStatusCode(StatusCodes.SIGNUP_SUCCESS);
					status.setStatusMessage(StatusMessages.SIGNUP_SUCCESSFULL_USER_ADDED);
					status.setState(State.SUCCESS);
					signUpEntryInResponse.setName(signUpEntry.getName());
					signUpEntryInResponse.setEmail(signUpEntry.getEmail());
					signUpEntryInResponse.setAccountNo(newlyAddedAccountNo);
					signUpResponse.setSignUpEntry(signUpEntryInResponse);
				}
			}
		} else {
			status.setStatusCode(StatusCodes.SIGNUP_FAILS_PARAMETER_MISSING);
			status.setStatusMessage(StatusMessages.SIGNUP_FAILS_MANTORY_PARAMETER_MISSING);
			status.setState(State.ERROR);
		}
		signUpResponse.setStatus(status);
		return signUpResponse;
	}

	public boolean itHasMandatoryParameterForSignUp(SignUpEntry signUpEntry) {
		boolean itHas = false;
		if (signUpEntry.getEmail()!=null && signUpEntry.getPassword()!=null
				&& signUpEntry.getName()!=null && signUpEntry.getAadhaar()!=null
				&& !signUpEntry.getEmail().equals("") && !signUpEntry.getPassword().equals("")
				&& !signUpEntry.getName().equals("") && !signUpEntry.getAadhaar().equals(0l)) {
			itHas = true;
		}
		return itHas;
	}
}
