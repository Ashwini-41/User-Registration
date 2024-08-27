package com.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	void FirstNametest() {
		UserRegistration ur = new UserRegistration();
		assertTrue(ur.validateFirstName("Ash"));
		
	}
	@Test
	void FirstNametest1() {
		UserRegistration ur = new UserRegistration();
		assertFalse(ur.validateFirstName("ashw"));
		
	}
	

}
