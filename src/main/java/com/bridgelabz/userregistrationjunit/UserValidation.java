package com.bridgelabz.userregistrationjunit;

public class UserValidation {
	public boolean validateName(String name) {
		String nameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
		return name.matches(nameRegex);
	}
	public boolean validateEmail(String email) {
		String emailRegix = "^[a-zA-Z]+[a-zA-Z0-9]*[. + - *]?[a-zA-Z0-9]*[@]{1}[a-zA-Z]+[[.]{1}[a-zA-Z0-9]*[.]?[a-zA-Z]{2}$";
		return email.matches(emailRegix);
	}
	public boolean validateMobileNumber(String Number) {
		String regexNumber = "^[0-9]{1,2}\\s{1}[0-9]{10}$";
		return regexNumber.matches(Number);
	}
	public boolean validatePassword(String password) {
		String regexPassword = "^(?=.*[A-Z])(?=.*[0-9](?=.{8,}$";
		return regexPassword.matches(password);
	}
}
