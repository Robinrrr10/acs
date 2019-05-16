package com.acbank.acs.main;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.acbank.acs.sign.api.SignIn;
import com.acbank.acs.sign.api.SignUp;

@ApplicationPath("v1")
public class AcsApplicationV1 extends Application {

	private Set<Class<?>> allClassForV1 = new HashSet<>();

	public AcsApplicationV1() {
		System.out.println("AcsAppliationV1-Start-adding-all-classes");
		allClassForV1.add(SignUp.class);
		allClassForV1.add(SignIn.class);
		System.out.println("AcsAppliationV1-all-classes-added-Done");
	}

	@Override
	public Set<Class<?>> getClasses() {
		return allClassForV1;
	}
}
