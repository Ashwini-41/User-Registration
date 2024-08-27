package com.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	void FirstNametest1() {
		UserRegistration ur = new UserRegistration();
		assertTrue(ur.validateFirstName("Ashwi"));
		
	}
	@Test
	void FirstNametest2() {
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
        assertFalse(ur.passwordValidation("abcdefg"));
	}
	
	@Test
	void PasswordTest2() {
		UserRegistration ur = new UserRegistration();
        assertFalse(ur.passwordValidation("Ashwinigar"));
	} 
	
	@Test
	void PasswordTest3() {
		UserRegistration ur = new UserRegistration();
        assertFalse(ur.passwordValidation("Password123"));
	}
	
	@Test
	void PasswordTest4() {
		UserRegistration ur = new UserRegistration();
        assertTrue(ur.passwordValidation("Password@123"));
	}
	
}
