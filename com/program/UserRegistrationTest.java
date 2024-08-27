package com.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	void FirstNametest() {
		UserRegistration ur = new UserRegistration();
		assertTrue(ur.validateFirstName("Ashwi"));
		
	}
	@Test
	void FirstNametest1() {
		UserRegistration ur = new UserRegistration();
		assertFalse(ur.validateFirstName("ashwini"));
		
	}
	
	@Test
	void LastNameTest1() {
		UserRegistration ur = new UserRegistration();
		assertTrue(ur.validateLastName("Garad"));

	}
	
	@Test
	void EmailTest1() {
		UserRegistration ur = new UserRegistration();
        assertTrue(ur.validateEmail("ashwi12@gmail.com"));
	}
	
	@Test
	void EmailTest2() {
		UserRegistration ur = new UserRegistration();
        assertFalse(ur.validateEmail("Abc@gmail.c"));
	}
	
	@Test
	void MobileNoTest() {
		UserRegistration ur = new UserRegistration();
        assertTrue(ur.validMobileNo("91 8765422116"));
		
	}
	
	@Test
	void PasswordTest1() {
		UserRegistration ur = new UserRegistration();
        assertTrue(ur.passwordValidation("abcdefghi"));
	}
	
	

}
