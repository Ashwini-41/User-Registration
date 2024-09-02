package com.program;
import java.util.function.Predicate;
//import java.util.regex.Pattern;

public class UserRegistration {
	
	// Lambda expressions for validation
    private static final Predicate<String> firstNameValidator = name -> name.matches("^[A-Z][a-zA-Z]{2,}$");
    private static final Predicate<String> lastNameValidator = name -> name.matches("^[A-Z][a-zA-Z]{2,}$");
    private static final Predicate<String> emailValidator = email -> email.matches("^[a-zA-Z0-9]+[\\._]?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2,3})?$");
    private static final Predicate<String> mobileValidator = mobile -> mobile.matches("^[0-9]{2} [0-9]{10}$");
    private static final Predicate<String> passwordValidator = password -> password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$");

    // Validation methods using lambdas
    public void validateFirstName(String firstName) throws InvalidUserDetailException {
        validate(firstName, firstNameValidator, "Invalid First Name");
    }

    public void validateLastName(String lastName) throws InvalidUserDetailException {
        validate(lastName, lastNameValidator, "Invalid Last Name");
    }

    public void validateEmail(String email) throws InvalidUserDetailException {
        validate(email, emailValidator, "Invalid Email");
    }

    public void validMobileNo(String mobile) throws InvalidUserDetailException {
        validate(mobile, mobileValidator, "Invalid Mobile Number");
    }

    public void passwordValidation(String password) throws InvalidUserDetailException {
        validate(password, passwordValidator, "Invalid Password");
    }

    // Generic validation method
    private void validate(String input, Predicate<String> validator, String errorMessage) throws InvalidUserDetailException {
        if (!validator.test(input)) {
            throw new InvalidUserDetailException(errorMessage);
        }
    }
	
	
}
