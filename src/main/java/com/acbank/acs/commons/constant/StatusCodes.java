package com.acbank.acs.commons.constant;

public interface StatusCodes
 {
	public static final int SIGNUP_SUCCESS = 10001;
	public static final int SIGNUP_FAILS_USER_ALREADY_EXISTS = 11001;
	public static final int SIGNUP_FAILS_PARAMETER_MISSING = 11002;
	public static final int INVALID = 11003;
	public static final int SIGNIN_SUCCESS = 12001;
	public static final int SIGNIN_FAIL = 12102;
	public static final int SIGNIN_FAIL_USER_NOT_AVAILABLE = 12103;
}
