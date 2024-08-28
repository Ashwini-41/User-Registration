package com.program;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//First name
	public boolean validateFirstName(String firstName) throws InvalidUserDetailException{
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        
		if( !Pattern.matches(regex, firstName)) {
			throw new InvalidUserDetailException("Invalid First Name");
			
		}
		return true;
    }
	
	//lastname
	public boolean validateLastName(String lastName)throws InvalidUserDetailException {
		String regex = "^[A-Z][a-zA-Z]{2,}$";
		
		if( !Pattern.matches(regex, lastName)) {
			throw new InvalidUserDetailException("Invalid Last Name");
		}
		return true;
	}
	//email
	public boolean validateEmail(String email) throws InvalidUserDetailException {
		String regex = "^[a-zA-Z0-9]+[\\._]?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2,3})?$";
		
		if ( !Pattern.matches(regex, email)){
			throw new InvalidUserDetailException("Invalid Email Address");
		}
		return true;
	}
	
	//mobile number
	public boolean validMobileNo(String mobileNo) throws InvalidUserDetailException{
		String regex = "^[0-9]{2} [0-9]{10}$";
		
		if ( !Pattern.matches(regex, mobileNo)) {
			throw new InvalidUserDetailException("Invalid Mobile Number");
		}
		return true;
	}
	
	//password
	public boolean passwordValidation(String password) throws InvalidUserDetailException {
		
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
        
		if( !Pattern.matches(regex, password)) {
			throw new InvalidUserDetailException("Invalid Password");
		}
		return true;
	}
	
	
	
}
