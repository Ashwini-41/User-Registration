package com.program;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
		return Pattern.matches(regex, firstName);
    }
	
	public boolean validateLastName(String lastName) {
		String regex = "^[A-Z][a-zA-Z]{2,}$";
		return Pattern.matches(regex, lastName);				
	}
	
	public boolean validateEmail(String email) {
		String regex = "^[a-zA-Z0-9]+[\\._]?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2,3})?$";
		return Pattern.matches(regex, email);
	}
	
	public boolean validMobileNo(String mobileNo) {
		String regex = "^[0-9]{2} [0-9]{10}$";
		return Pattern.matches(regex, mobileNo);
	}
	
	
}
