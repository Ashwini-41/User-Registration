package com.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UserRegistrationTest {

	@Test
	void FirstNametest1() {
		UserRegistration ur = new UserRegistration();
		assertDoesNotThrow(() -> ur.validateFirstName("Ashwi"));
		
	}
	@Test
	void FirstNametest2() {
		UserRegistration ur = new UserRegistration();
		Exception exception = assertThrows(InvalidUserDetailException.class, () -> ur.validateFirstName("ashwini"));
	    assertEquals("Invalid First Name", exception.getMessage());
	}
	
	@Test
	void LastNameTest1() {
		UserRegistration ur = new UserRegistration();
		
		assertDoesNotThrow(() -> ur.validateLastName("Garad"));

	}
	
	@Test
	void LastNameTest2() {
		UserRegistration ur = new UserRegistration();
		Exception exception = assertThrows(InvalidUserDetailException.class, () -> ur.validateLastName("gar"));
		assertEquals("Invalid Last Name",exception.getMessage());
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
    	if(expectedResult) {
    		assertDoesNotThrow(() -> ur.validateEmail(email) );
    	}else {
    		assertThrows(InvalidUserDetailException.class , () -> ur.validateEmail(email));
    	}
    
    }
	
	@Test
	void MobileNoTest() {
		UserRegistration ur = new UserRegistration();
        assertDoesNotThrow(() -> ur.validMobileNo("91 8765422116"));
		
	}
	
	@Test
	void PasswordTest1() {
		UserRegistration ur = new UserRegistration();
		Exception exp = assertThrows(InvalidUserDetailException.class, () -> ur.passwordValidation("abcdft") );
		assertEquals("Invalid Password" , exp.getMessage());
	}
	
	@Test
	void PasswordTest2() {
		UserRegistration ur = new UserRegistration();
		Exception exp = assertThrows(InvalidUserDetailException.class, () -> ur.passwordValidation("Ashwinigar") );
		assertEquals("Invalid Password" , exp.getMessage());
 
	} 
	
	@Test
	void PasswordTest3() {
		UserRegistration ur = new UserRegistration();
		Exception exp = assertThrows(InvalidUserDetailException.class , () -> ur.passwordValidation("Password123") ); 
		assertEquals("Invalid Password" , exp.getMessage());
	}
	
	@Test
	void PasswordTest4() {
		UserRegistration ur = new UserRegistration();
        assertDoesNotThrow(() -> ur.passwordValidation("Password@123"));
	}
	
}
