package com.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
	
	 // Parameterized Email Tests
    @ParameterizedTest
    @CsvSource({
        "ashwi12@gmail.com, true",
        "Abc@gmail.c, false",     // Invalid domain
        "abc.100@yahoo.com, true",
        "abc()*@gmail.com, false", // Invalid characters
        "plainaddress, false",    // Invalid format
        "user@.com, false" ,       // Invalid
        "8. abc@%*.com, false"
    })
    void testEmailValidation(String email, boolean expectedResult) {
    	UserRegistration ur = new UserRegistration();
    	assertEquals(expectedResult, ur.validateEmail(email));
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
